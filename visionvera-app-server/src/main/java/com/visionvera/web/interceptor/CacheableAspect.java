package com.visionvera.web.interceptor;

import com.visionvera.annotation.ExtCacheable;
import com.visionvera.dao.JRedisDao;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * redis缓存处理
 * 不适用与内部方法调用(this.)或者private
 */
@Component
@Aspect
public class CacheableAspect {
    /**
     *
     */

    @Autowired
    private JRedisDao jedisDao;

    //定义切点
    @Pointcut("@annotation(com.visionvera.annotation.ExtCacheable)")
    public void annotationPointcut() {
    }

    //获取到切点
    @Around("annotationPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获得当前访问的class
        Class<?> className = joinPoint.getTarget().getClass();
        // 获得访问的方法名
        String methodName = joinPoint.getSignature().getName();
        // 得到方法的参数的类型
        Class<?>[] argClass = ((MethodSignature) joinPoint.getSignature()).getParameterTypes();
        Object[] args = joinPoint.getArgs();
        String key = "";
        int expireTime = 1800;
        try {
            // 得到访问的方法对象
            Method method = className.getMethod(methodName, argClass);
            method.setAccessible(true);
            // 判断是否存在@ExtCacheable注解
            if (method.isAnnotationPresent(ExtCacheable.class)) {
                ExtCacheable annotation = method.getAnnotation(ExtCacheable.class);
                key = getRedisKey(args,annotation);
                expireTime = getExpireTime(annotation);
            }
        } catch (Exception e) {
            throw new RuntimeException("redis缓存注解参数异常", e);
        }
        // 获取缓存是否存在
        boolean hexists = jedisDao.exists(key);
        if (hexists) {
            return jedisDao.get(key);
        } else {
            //执行原方法（java反射执行method获取结果）
             String res =  (String) joinPoint.proceed();
            //设置缓存以及过期时间
            jedisDao.set(key,res,expireTime);
            return res;
        }
    }

    private int getExpireTime(ExtCacheable annotation) {
        return annotation.expireTime();
    }

    private String getRedisKey(Object[] args,ExtCacheable annotation) {
        String primalKey = annotation.key();
        //获取#p0...集合
        List<String> keyList = getKeyParsList(primalKey);
        for (String keyName : keyList) {
            int keyIndex = Integer.parseInt(keyName.toLowerCase().replace("#p", ""));
            Object parValue = args[keyIndex];
            primalKey = primalKey.replace(keyName, String.valueOf(parValue));
        }
        return primalKey.replace("+","").replace("'","");
    }

    // 获取key中#p0中的参数名称
    private static List<String> getKeyParsList(String key) {
        List<String> ListPar = new ArrayList<String>();
        if (key.indexOf("#") >= 0) {
            int plusIndex = key.substring(key.indexOf("#")).indexOf("+");
            int indexNext = 0;
            String parName = "";
            int indexPre = key.indexOf("#");
            if(plusIndex>0){
                indexNext = key.indexOf("#") + key.substring(key.indexOf("#")).indexOf("+");
                parName = key.substring(indexPre, indexNext);
            }else{
                parName = key.substring(indexPre);
            }
            ListPar.add(parName.trim());
            key = key.substring(indexNext + 1);
            if (key.indexOf("#") >= 0) {
                ListPar.addAll(getKeyParsList(key));
            }
        }
        return ListPar;
    }

}
