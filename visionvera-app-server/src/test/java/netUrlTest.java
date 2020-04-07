import com.visionvera.bean.restful.client.RestClient;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName netUrlTest
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年08月07日 13:45
 **/
public class netUrlTest {

    @Test
    public  void urlContent()throws Exception{
        String str = getContentFromURL("http://www.xinhxu.com/");
        System.out.println(str);
    }

    private static String getContentFromURL(String urladdr)
            throws IOException {
        InputStream is=null;
        try {
            URL url=new URL(urladdr);
            URLConnection conn=url.openConnection();
            conn.setRequestProperty ("User-Agent", "Profile/MIDP-1.0 Configuration/CLDC-1.0");
            is=conn.getInputStream();
            BufferedReader br=new BufferedReader(
                    new InputStreamReader(is));
            StringBuilder sb=new StringBuilder();
            String str=null;
            while((str=br.readLine())!=null){
                sb.append(str+"\n");
            }
            conn.getInputStream().close();
            return sb.toString();
        }finally{
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {}
            }
        }
    }

    @Test
    public void rewrw(){
        Long num1=System.currentTimeMillis();

        for (int i =0; i<100;i++){
            RestClient.get("http://192.168.112.83:8799/app-server/rest/unifiedInterface/netWork/1/test","22222222222222222222222222222222",null);
        }
        Long num2=System.currentTimeMillis();
        Long num3=num2-num1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    /**
     *  Class<NetWorkService> serviceClass = NetWorkService.class;
     *         Method getToken = serviceClass.getMethod("getToken");
     *         ExtCacheable[] annotationsByType = getToken.getAnnotationsByType(ExtCacheable.class);
     *         for (ExtCacheable extCacheable : annotationsByType) {
     *             System.out.println(extCacheable.expireTime());
     *         }
     */
}
