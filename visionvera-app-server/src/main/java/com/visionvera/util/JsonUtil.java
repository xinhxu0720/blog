package com.visionvera.util;


import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * JSON工具类
 */
@SuppressWarnings("unchecked")
public final class JsonUtil {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = Logger.getLogger(JsonUtil.class);

    private static ObjectMapper MAPPER;

    static {
        MAPPER = generateMapper(JsonSerialize.Inclusion.ALWAYS);
    }

    private JsonUtil() {
    }

    /**
     * 将json通过类型转换成对象
     * @param json  json字符串
     * @param clazz 泛型类型
     * @return 返回对象
     * @throws IOException
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        try {
            if (null == json || "".equals(json)) return null;
            return clazz.equals(String.class) ? (T) json : MAPPER.readValue(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json通过类型转换成对象
     *
     * @param json          json字符串
     * @param typeReference 引用类型
     * @return 返回对象
     * @throws IOException
     */
    public static <T> T fromJson(String json, TypeReference<?> typeReference) throws IOException {
        if (null == json || "".equals(json)) return null;
        return (T) (typeReference.getType().equals(String.class) ? json : MAPPER.readValue(json, typeReference));
    }

    /**
     * 将对象转换成json
     *
     * @param src 对象
     * @return 返回json字符串
     * @throws IOException
     */
    public static <T> String toJson(T src) {
        try {
            return src instanceof String ? (String) src : MAPPER.writeValueAsString(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将对象转换成json, 可以设置输出属性
     *
     * @param src       对象
     * @param inclusion 传入一个枚举值, 设置输出属性
     * @return 返回json字符串
     * @throws IOException
     */
    public static <T> String toJson(T src, JsonSerialize.Inclusion inclusion) throws IOException {
        if (src instanceof String) {
            return (String) src;
        } else {
            ObjectMapper customMapper = generateMapper(inclusion);
            return customMapper.writeValueAsString(src);
        }
    }

    /**
     * 将对象转换成json, 传入配置对象
     *
     * @param src    对象
     * @param mapper 配置对象
     * @return 返回json字符串
     * @throws IOException
     * @see ObjectMapper
     */
    public static <T> String toJson(T src, ObjectMapper mapper) throws IOException {
        if (null != mapper) {
            if (src instanceof String) {
                return (String) src;
            } else {
                return mapper.writeValueAsString(src);
            }
        } else {
            return null;
        }
    }

    /**
     * 返回{@link ObjectMapper ObjectMapper}对象, 用于定制性的操作
     */
    public static ObjectMapper mapper() {
        return MAPPER;
    }

    /**
     * 通过Inclusion创建ObjectMapper对象
     *
     * @return 返回ObjectMapper对象
     */
    private static ObjectMapper generateMapper(JsonSerialize.Inclusion inclusion) {

        ObjectMapper customMapper = new ObjectMapper();

        // 设置输出时包含属性的风格
        customMapper.setSerializationInclusion(inclusion);

        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        customMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 禁止使用int代表Enum的order()來反序列化Enum,非常危險
        customMapper.configure(DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS, true);

        // 所有日期格式都统一为以下样式
        customMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

        return customMapper;
    }

    /**
     * 默认的ObjectMapper
     * @return ObjectMapper
     * @author zhaotianming@360buy.com
     */
    public static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        //取消毫秒显示日期
        //objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        return objectMapper;
    }

    /**
     * 将json通过类型转换成集合对象
     *
     * @param json json字符串
     * @param clazz 引用类型
     * @return 返回集合
     * @throws IOException
     */
    public static <T> List<T> fromJsonToList(String json, Class<T> clazz) throws IOException {
        if (null == json || "".equals(json)) return null;
        JavaType javaType = getCollectionType(List.class, clazz);
        return (List<T>) MAPPER.readValue(json, javaType);
    }

    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return MAPPER.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }


}
