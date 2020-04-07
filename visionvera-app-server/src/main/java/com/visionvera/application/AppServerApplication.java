package com.visionvera.application;

import com.visionvera.config.SysConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.net.ssl.*;
import javax.servlet.MultipartConfigElement;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

//禁用SpringBoot自带自动数据源的配置
@SpringBootApplication
@EnableDiscoveryClient//开启Eureka注册发现服务 
@EnableFeignClients(basePackages = {"com.visionvera.feign"})//开启Feign调用
@ComponentScan(basePackages = {"com.visionvera"})//扫描其他包的注解
@EnableAspectJAutoProxy(exposeProxy = true)//开启AOP方法内部拦截
//@EnableCaching //开启缓存
//@EnableAsync //开启异步
public class AppServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AppServerApplication.class, args);
		if(run.getBean(SysConfig.class).getHgProtocol().equals("https")){
			disableSslVerification();
		}

    }

	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("2500Mb");
		factory.setMaxRequestSize("2500Mb");
		return factory.createMultipartConfig();
	}

	private static void disableSslVerification() {
		try
		{
			TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}
				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			}
			};

			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
	}
}
