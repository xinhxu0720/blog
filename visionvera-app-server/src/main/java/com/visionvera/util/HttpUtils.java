package com.visionvera.util;

import com.alibaba.fastjson.JSONObject;
import com.visionvera.constrant.WsConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * html帮助类
 * @author chenting
 *
 */
public class HttpUtils {
    private static final Logger logger = LogManager.getLogger(HttpUtils.class);
    /**
     * css链接地址正则
     */
    public static String cssRegex = "<link(\\W.*)(\\w.*)href=\"\\w.*?\"\\s*[/]{0,1}>";

    /**
     * 截取HTML中的CSS样式
     *
     * @param html
     * @return
     */
    public static String getCssFile(String html) {
        html = "<link rel=\"stylesheet\" href=\"http://127.0.0.1:8080/wordsystem/resource/js/layer/skin/layer.css?v=1481185129776\">\r\n" +
                "<link rel=\"stylesheet\" href=\"http://127.0.0.1:8080/wordsystem/resource/css/nopublic.css?v=1481185129776\" />\r\n" +
                "<link rel=\"stylesheet\" href=\"http://127.0.0.1:8080/wordsystem/resource/css/editormd.preview.css?v=1481185129776\" />\r\n" +
                "<link rel=\"stylesheet\" href=\"http://127.0.0.1:8080/wordsystem/resource/css/iconfont/iconfont.css?v=1481185129776\" />\r\n";
        Pattern r = Pattern.compile(cssRegex);
        Matcher m = r.matcher(html);
        StringBuffer cssStr = new StringBuffer();
        while (m.find()) {
            String temp = m.group();
            temp = temp.substring(temp.indexOf("href=\"") + 6, temp.lastIndexOf("\""));
            System.out.println(temp);
            cssStr.append(sendPost(temp, "")).append("\r\n");
        }
        return cssStr.toString();
    }

    /**
     * 根据正则表达式获取指定的字符串数组
     *
     * @param html
     * @param regex
     * @return
     */
    public static String[] getHtmlStr(String html, String regex) {
        List<String> list = new ArrayList<String>();
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(html);
        if (m.find()) {
            list.add(m.group());
        }
        return list.toArray(new String[]{});
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url;
            if (param != null) {
                urlNameString = (url + "").indexOf("?") == -1 ? (url + "?" + param) : (url + "&" + param);
            }
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            //设置连接主机超时
            connection.setConnectTimeout(5000);
            //设置从主机读取数据超时（单位：毫秒）
            //connection.setReadTimeout(30000);
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            logger.info("请求路径：" + url);
            if (param != null) {
                logger.info("请求参数：" + param);
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            logger.info("请求成功：" + result);
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
            result = "error";
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
            result = "error";

        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }


    /**
     * @param url
     * @param param
     * @return String
     * @Description:向指定 URL 发送POST方法的请求 (json格式)
     * @author quboka
     * @date 2018年1月5日
     */
    public static String sendJsonPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("content-type", "application/json");

            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
            result = "error";
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, Map<String, Object> paramMap) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        String param = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());

            //拼接参数
            Set<Entry<String, Object>> set = paramMap.entrySet();
            for (Entry<String, Object> entry : set) {
                if ("null".equals(entry.getValue())) {
                    param += "&" + entry.getKey() + "=" + "";
                } else {
                    param += "&" + entry.getKey() + "=" + URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
                }

            }
            if (param != null && !"".equals(param)) {
                param = param.substring(1);
            }
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            logger.error("发送 POST 请求出现异常！", e);
            e.printStackTrace();
            result = "error";
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * @param url
     * @param paramMap     参数
     * @param customConfig 请求头设置
     * @return String
     * @Description: 发送post请求 (可设置请求头)
     * @author quboka
     * @date 2018年1月5日
     */
    public static String sendPost(String url, String param, Map<String, String> customConfig) {
    	/* json格式的请求头：
    	 * Map<String, String> headersMap = new HashMap<String, String>();
		   headersMap.put("Content-type", "application/json");
	       headersMap.put("Accept", "application/json");*/
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("Accept-Charset", "UTF-8");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            if (null != customConfig && customConfig.size() > 0) {
                for (Entry<String, String> entry : customConfig.entrySet()) {
                    conn.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
            logger.info("请求地址:" + url);
//            if(paramMap != null && paramMap.size() > 0) {
//            	String paramJson = JSONObject.toJSONString(paramMap);
            logger.info("请求参数:" + param);
//                // 发送请求参数
            out.print(param);
//            }
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            logger.error("发送 POST 请求出现异常！", e);
            e.printStackTrace();
            return "error";
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * @param filePath  文件路径
     * @param sendParam 其他参数(json格式)
     * @param toUrl     请求的url
     * @return String
     * @Description: 上传
     * @author quboka
     * @date 2018年1月5日
     */
    public static String sendFilePost(String filePath, String sendParam,
                                      String toUrl) {

        OutputStream out = null;
        DataInputStream in = null;
        BufferedReader reader = null;

        try {
            // 换行符
            final String newLine = "\r\n";
            final String boundaryPrefix = "--";
            // 定义数据分隔线
            String BOUNDARY = "file-desc-post-boundary-1e4j56df90j4h";
            // 服务器的域名
            URL url = new URL(toUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置为POST请求
            conn.setRequestMethod("POST");
            // POST请求设置
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            // 设置请求头参数
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("Charsert", "UTF-8");
            conn.setRequestProperty("Content-Type",
                    "multipart/form-data; boundary=" + BOUNDARY);

            out = new DataOutputStream(conn.getOutputStream());

            // 发送附加信息
            StringBuilder sbDesc = new StringBuilder();

            sbDesc.append(boundaryPrefix + BOUNDARY + newLine)
                    .append("Content-Type: text/plain" + newLine)
                    .append("Content-Disposition: form-data; name=\"sendParam\"")
                    .append(newLine).append(newLine).append(sendParam)
                    .append(newLine).append(boundaryPrefix).append(BOUNDARY)
                    .append(newLine);

            out.write(sbDesc.toString().getBytes("UTF-8"));

            // 发送文件
            File file = new File(filePath);
            StringBuilder sbFile = new StringBuilder();
            // 文件参数
            sbFile.append(
                    "Content-Disposition: form-data;name=\"file\";filename=\"")
                    .append(filePath).append("\"").append(newLine);
            sbFile.append("Content-Type:application/octet-stream");
            // 参数头设置完以后需要两个换行，然后才是参数内容
            sbFile.append(newLine);
            sbFile.append(newLine);

            // 将参数头的数据写入到输出流中
            out.write(sbFile.toString().getBytes());

            // 数据输入流,用于读取文件数据
            in = new DataInputStream(new FileInputStream(file));
            byte[] bufferOut = new byte[1024];
            int bytes = 0;
            // 每次读1KB数据,并且将文件数据写入到输出流中
            while ((bytes = in.read(bufferOut)) != -1) {
                out.write(bufferOut, 0, bytes);
            }
            // 最后添加换行
            out.write(newLine.getBytes());

            // 定义最后数据分隔线，即--加上BOUNDARY再加上--。
            byte[] end_data = (newLine + boundaryPrefix + BOUNDARY
                    + boundaryPrefix + newLine).getBytes();
            // 写上结尾标识
            out.write(end_data);
            out.flush();

            // 定义BufferedReader输入流来读取URL的响应
            reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (Exception e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
            return "error";
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //上传 示例：
        String filePath = "C:\\Users\\13624\\Desktop\\22.jpg";
        String toUrl = "http://localhost:8080/SLWUnityPlatform/image/uploadPic.do";
        String sendParams = "{\"createTime\":1512984899000,\"createUserId\":101,\"createUserName\":\"liangjun1\",\"fileName\":\"火男\",\"filePath\":\"d:/mnt/mfs1/tmppath/media/thirdfile/2017-12-11/192.168.10.477.txt\",\"fileSize\":3339,\"fileType\":1,\"filetypename\":\"启明1\",\"id\":113,\"index\":0,\"picPath\":\"\",\"rand\":\"eddfc2e9-713c-4f62-832a-cefb076f4bda\",\"remark\":\"全文全文\",\"status\":0,\"version\":2}";
        String sendFilePost = sendFilePost(filePath, null, toUrl);
        System.err.println(sendFilePost);

        //json 示例
        String result = HttpUtils.sendJsonPost("http://localhost:8080/slweoms/test.do", "{\"id\":1,\"state\":2}");
        System.out.println(result);

    }

    /**
     *  * 将输入流转化成字节流
     *      * @param inStream
     *      * @return
     *      * @throws IOException
     *      
     */
    public static final byte[] input2byte(InputStream inStream) throws IOException {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[100];
        int rc = 0;
        while ((rc = inStream.read(buff, 0, 100)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        byte[] in2b = swapStream.toByteArray();
        return in2b;
    }


    /**
     * 将MultipartFile转换为File
     *
     * @param ins
     * @param file
     */
    public static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static <T> Map<String, Object> postSendFiles(String url, String token, MultipartFile[] multipartFiles) {
        // 换行，或者说是回车
        final String newLine = "\r\n";
        // 固定的前缀
        final String preFix = "--";
        // 分界线，就是上面提到的boundary，可以是任意字符串，建议写长一点，这里简单的写了一个#
        final String bounDary = "----WebKitFormBoundaryCXRtmcVNK0H70msG";
        //请求返回内容
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String result = "";
        try {
//            Properties systemProperties = System.getProperties();
//            systemProperties.setProperty("http.proxyHost", "192.168.112.83");
//
//            systemProperties.setProperty("http.proxyPort", String.valueOf(3128));
            logger.info("POST方式调用远端webservice方法：" + url + "；参数: " + multipartFiles);
            //统一资源定位符
            URL uploadFileUrl = new URL(linkUrl(url, token, null));

            //打开http链接类
            HttpURLConnection httpURLConnection = (HttpURLConnection) uploadFileUrl.openConnection();
            //设置是否向httpURLConnection输出
            httpURLConnection.setDoOutput(true);
            //设置请求方法默认为get
            httpURLConnection.setRequestMethod(WsConstants.METHOD_POST);
            //Post请求不能使用缓存
            httpURLConnection.setUseCaches(false);
            httpURLConnection.usingProxy();
            httpURLConnection.setConnectTimeout(6000);//连接超时时间（毫秒）
            httpURLConnection.setReadTimeout(20000);//读取超时
            //配置请求头
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + bounDary);

            DataOutputStream dos = new DataOutputStream(httpURLConnection.getOutputStream());
            InputStream inputStream = null;
            //上传文件
            for (MultipartFile file : multipartFiles) {
                if (file != null) {
                    //将MultipartFile转换为File
                    File toFile = null;
                    if (file.equals("") || file.getSize() <= 0) {
                        file = null;
                    } else {
                        InputStream ins = null;
                        ins = file.getInputStream();
                        toFile = new File(file.getOriginalFilename());
                        inputStreamToFile(ins, toFile);
                        ins.close();
                    }
                    inputStream = new FileInputStream(toFile);
                    byte[] bytes = input2byte(inputStream);
                    String filePrams = "file";
                    //向请求中加入分隔符号
                    dos.write((preFix + bounDary + newLine).getBytes());
                    //将byte写入
                    dos.writeBytes("Content-Disposition: form-data; " + "name=\"" + URLEncoder.encode(filePrams, "utf-8") + "\"" + "; filename=\"" + URLEncoder.encode(file.getOriginalFilename(), "utf-8") + "\"" + newLine);
                    dos.writeBytes(newLine);
                    dos.write(bytes);
                    //向请求中拼接空格
                    dos.writeBytes(newLine);
                }
            }
            dos.writeBytes(preFix + bounDary + preFix + newLine);
            //请求完成后关闭流
            //得到相应码
            dos.flush();
            //判断请求没有成功
            if (httpURLConnection.getResponseCode() != 200) {
                resultMap.put("errcode", 1);
                resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpURLConnection.getResponseCode());
                logger.error("访问远端服务器失败: errorcode " + httpURLConnection.getResponseCode());
                return resultMap;
            }
            BufferedReader responseBuffer = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
            String output;
            while ((output = responseBuffer.readLine()) != null) {
                result += output;
            }
            httpURLConnection.disconnect();
            dos.close();
            logger.info("POST方式调用远端webservice方法：" + url + "；返回值: " + result);

        } catch (MalformedURLException e) {
            resultMap.put("errcode", 1);
            resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
            logger.error("访问远端服务器失败: ", e);
            return resultMap;
        } catch (IOException e) {
            resultMap.put("errcode", 1);
            if (e instanceof ConnectException || e instanceof SocketTimeoutException) {
                resultMap.put("errmsg", "访问远端服务器失败，连接超时");
            } else {
                resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
            }
            logger.error("访问远端服务器失败: ", e);
            return resultMap;
        }
        return json2Map(result, resultMap);
    }

    /**
     * json字符串转换成map
     *
     * @param json
     * @param resultMap
     * @return
     * @author 谢程算
     * @date 2017年2月8日
     * @version 1.0.0
     */
    @SuppressWarnings("unchecked")
    private static Map<String, Object> json2Map(String json, Map<String, Object> resultMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(json, Map.class);
//			map.putAll(resultMap);
        } catch (Exception e) {
            logger.error("远端服务器获取的数据转换成Map时失败: ", e);
            map.put("errcode", 1);
            map.put("errmsg", "返回结果异常");
            map.put("result", false);
            map.put("msg", "返回结果异常");
        }
        return map;
    }

    /**
     * in
     *
     * @param url
     * @param token
     * @param args
     * @return
     * @author 谢程算
     * @date 2017年2月8日
     * @version 1.0.0
     */
    private static String linkUrl(String url, String token, Map<String, Object> args) {
        Set<String> keySet = null;
        if (args != null) {
            keySet = args.keySet();
        }
        if (StringUtils.isNotBlank(token)) {
            url += "?" + WsConstants.KEY_TOKEN + "=" + token;
        }
        if (keySet != null) {
            for (String key : keySet) {
                url += "&" + key + "=" + args.get(key);
            }
        }
        //统一添加“微服务”标识
        url += "&microServerFlag=1";

        if (StringUtils.isBlank(token) && url.indexOf("?") < 0) {
            url = url.replaceFirst("&", "?");
        }
        return url;
    }

    public static <T> Map<String, Object> put(String url, String token, T args) {
        String result = "";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            logger.info("POST方式调用远端webservice方法：" + url + "；参数: " + args);

            Properties systemProperties = System.getProperties();
            systemProperties.setProperty("http.proxyHost", "192.168.112.83");

            systemProperties.setProperty("http.proxyPort", String.valueOf(3128));

            URL targetUrl = new URL(linkUrl(url, token, null));
            HttpURLConnection httpConnection = (HttpURLConnection) targetUrl
                    .openConnection();
            httpConnection.usingProxy();
            httpConnection.setConnectTimeout(6000);//连接超时时间（毫秒）
            httpConnection.setReadTimeout(20000);//读取超时
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod(WsConstants.METHOD_PUT);
            httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, WsConstants.PROP_CONTENT_JSON);
//			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);
            String json = null;
            if (args != null) {
                json = JSONObject.toJSONString(args); //保留map中值为null的属性
                logger.info("json =======================" + json);
                OutputStream outputStream = httpConnection.getOutputStream();
                outputStream.write(json.getBytes("utf-8"));
                outputStream.flush();
            }
            if (httpConnection.getResponseCode() != 200) {
                resultMap.put("errcode", 1);
                resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
                logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
                return resultMap;
            }

            BufferedReader responseBuffer = new BufferedReader(
                    new InputStreamReader(httpConnection.getInputStream(), "utf-8"));
            String output;
            while ((output = responseBuffer.readLine()) != null) {
                result += output;
            }
            httpConnection.disconnect();
//			resultMap.put("errcode", 0);
//			resultMap.put("errmsg", "操作成功");
            logger.info("POST方式调用远端webservice方法：" + targetUrl + "；参数: " + json + "；返回值: " + result);
        } catch (MalformedURLException e) {
            resultMap.put("errcode", 1);
            resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
            logger.error("访问远端服务器失败: ", e);
            return resultMap;
        } catch (IOException e) {
            resultMap.put("errcode", 1);
            if (e instanceof ConnectException || e instanceof SocketTimeoutException) {
                resultMap.put("errmsg", "访问远端服务器失败，连接超时");
            } else {
                resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
            }
            logger.error("访问远端服务器失败: ", e);
            return resultMap;
        }
        return json2Map(result, resultMap);
    }
}
