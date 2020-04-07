package com.visionvera.web.interceptor;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.visionvera.annotation.MeetingLog;
import com.visionvera.exception.BusinessException;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


@Aspect
@Component
public class SystemLogAspect {
    //注入Service用于把日志保存数据库
    // @Resource
    // private LogService logService;
    //本地异常日志记录对象
    private static final Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);
    // /** 智能运维统一平台的平台类别: 1 */
    //    public static final String INTELLIGENT_OPERATION_PLATFORM_TYPE = "1";
    //    /** 视联汇APP的平台类别: 3 */
    //    public static final String ME_APP_PLATFORM_TYPE = "3";
    //    /** 视联管家(Pamir Mobile)的平台类别: 4 */
    //    public static final String PAMIR_MOBILE_PLATFORM_TYPE = "4";
    //    /** 流媒体的平台类别: 5 */
    //    public static final String MEDIA_SERVER_PLATFORM_TYPE = "5";
    //    /** 会管Web平台的平台类别: 6 */
    //    public static final String CMS_WEB_PLATFORM_TYPE = "6";
    //    /** PServer/掌上通平台的平台类别: 7 */
    //    public static final String P_SERVER_PLATFORM_TYPE = "7";
    //    /** 网管平台的平台类别: 8 */
    //    public static final String NETWORK_MANAGER_PLATFORM_TYPE = "8";
    //    /** 会易通平台的平台类别: 9 */ 平台类型
    //    public static final String HUIYITONG_PLATFORM_TYPE = "9";
    //    /** 一机一档平台的平台类别: 10 */
    //    public static final String VSDC_PLATFORM_TYPE = "10";

    private static final Integer[] PLATFORM_TYPE = {1, 3, 4, 5, 6, 7, 8, 9, 10};


    //Service层切点
    @Pointcut("@annotation(com.visionvera.annotation.SystemServiceLog)")
    public void serviceAspect() {
    }

    //Controller层切点
    @Pointcut("@annotation(com.visionvera.annotation.MeetingLog)")
    public void controllerAspect() {
    }

    /**
     * 前置通知 判断标识是否合法
     * @param joinPoint
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        boolean isExit = false;
        Map<String, Object> fieldsName = getFieldsName(joinPoint);
        if (!fieldsName.isEmpty()) {
            Integer flag = (Integer) fieldsName.get("flag");
            for (Integer type : PLATFORM_TYPE) {
                if (type == flag) {
                    isExit = true;
                }
            }
            if (!isExit) {
                throw new BusinessException("未识别平台类型");
            }
        }
        throw new BusinessException("获取参数异常");

    }

    /**
     * 后置通知 把会议操作记录全部存储起来
     * @param joinPoint
     */
    @After("controllerAspect()")
    public void doAfter(JoinPoint joinPoint) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //读取session中的用户
        //请求的IP
        String uri = request.getRequestURI();
        System.out.println("请求分发路径：" + request.getServletPath());
        System.out.println("端口号：" + request.getServerPort());
        System.out.println("服务器地址：" + request.getServerName());
        System.out.println("请求方式" + request.getScheme());
        System.out.println("所有参数:" + request.getQueryString());
        // System.out.println("body体参数:"+getBodyMsg(request));
        String ip = request.getRemoteAddr();
        try {

          /*  Signature signature = joinPoint.getSignature();//此处joinPoint的实现类是MethodInvocationProceedingJoinPoint
            MethodSignature methodSignature = (MethodSignature) signature;//获取参数名
            SystemControllerLog ypjglog = methodSignature.getMethod().getAnnotation(SystemControllerLog.class);
            System.out.println(ypjglog.description());
              //  return pjp.proceed(); //直接pjp.proceed()，没有return ，前台页面获取不到ajax数据*/

            //MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            //Method method = signature.getMethod();
            //SystemControllerLog authCode = method.getAnnotation(SystemControllerLog.class);
            //  Object[] args = joinPoint.getArgs();
            //获取到请求参数
            Map<String, Object> fieldsName = getFieldsName(joinPoint);

            System.out.println(fieldsName);
            //*========控制台输出=========*//
            System.out.println("=====后置通知开始=====");
            System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
            System.out.println("方法描述:" + getControllerMethodDescription(joinPoint));
            System.out.println("请求IP:" + ip);
            //*========数据库日志=========*//
          /*  Log log = SpringContextHolder.getBean("logxx");
            log.setDescription(getControllerMethodDescription(joinPoint));
            log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
            log.setType("0");
            log.setRequestIp(ip);
            log.setExceptionCode( null);
            log.setExceptionDetail( null);
            log.setParams( null);
            log.setCreateBy(user);
            log.setCreateDate(DateUtil.getCurrentDate());
            //保存数据库
            logService.add(log);*/
            System.out.println("=====后置通知结束=====");

        } catch (Exception e) {
            //记录本地异常日志
            logger.error("==前置通知异常==");
            logger.error("异常信息:{}", e.getMessage());
        }
    }

    /**
     * @Description: 获取所有请求参数转换成JSONObject
     * @Param: [joinPoint]
     * @return: java.util.Map<java.lang.String   ,   java.lang.Object>
     * @Author: 徐鑫辉
     * @Date: 16:16 2019/9/2
     */

    private static Map<String, Object> getFieldsName(JoinPoint joinPoint) {
        // 参数值
        Object[] args = joinPoint.getArgs();
        JSONObject jsonObject = new JSONObject();
        ParameterNameDiscoverer pnd = new DefaultParameterNameDiscoverer();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        String[] parameterNames = pnd.getParameterNames(method);
        for (int i = 0; i < parameterNames.length; i++) {
            jsonObject.put(parameterNames[i], args[i]);
        }
        return jsonObject;
    }


    /**
     * 获取注解中对方法的描述信息 用于Controller层注解
     *
     * @param joinPoint 切点
     * @return 方法描述
     * @throws Exception
     */
    public static String getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(MeetingLog.class).description();
                    break;
                }
            }
        }
        return description;
    }


}