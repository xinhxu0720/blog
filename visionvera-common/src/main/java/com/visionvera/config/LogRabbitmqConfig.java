package com.visionvera.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.visionvera.constrant.CommonConstrant;


/**
 * @author Administrator
 */
@Configuration
public class LogRabbitmqConfig {

    public static final String EXCHANGE = "logExchange";
    public static final String SYS_LOG_QUEUES ="logQueue";
    public static final String SYS_LOG_KEY = "logRoute";

    @Bean
    public Exchange exchange() {
        return new FanoutExchange(EXCHANGE);
    }

    @Bean(name=SYS_LOG_QUEUES)
    public Queue sysLogQueues() {
        return new Queue(SYS_LOG_QUEUES);
    }

    @Bean
    public Binding bindingExchange(@Qualifier(SYS_LOG_QUEUES) Queue sysLogQueues,Exchange exchange) {
        return BindingBuilder.bind(sysLogQueues).to(exchange).with(SYS_LOG_KEY).noargs();
    }
    
/*	*//**
	 * 配置队列名称为LogQueue
	 * @return
	 *//*
	@Bean(name = CommonConstrant.RABBITMQ_LOG_QUEUE_NAME)
	public Queue logQueue() {
		*//**
		 * 第一个参数为队列名称，第二个参数表示消息是否持久化
		 * 第三个参数表示是否独占队列: 即断开后是否自动删除
		 * 第四个参数表示当所有消费者客户端连接断开时是否自动删除队列
		 * 第五个参数表示Map类型的其他参数
		 *//*
		return new Queue(CommonConstrant.RABBITMQ_LOG_QUEUE_NAME, true, false, false, null);
	}
	
	*//**
	 * 配置交换机(路由器)及其类型。FanoutExchange表示广播式交换器
	 * @return
	 *//*
	@Bean(name = CommonConstrant.RABBITMQ_LOG_EXCHANGE_NAME)
	public FanoutExchange logExchange() {
		*//**
		 * 第一个参数表示交换机名称，第二个参数表示是否持久化，第三个参数表示断开后是否自动删除
		 *//*
		return new FanoutExchange(CommonConstrant.RABBITMQ_LOG_EXCHANGE_NAME, true, false);
	}
	
	*//**
	 * 配置绑定:logExchange与logQueue进行绑定
	 * @param logQueue 使用的队列
	 * @param logExchange 使用的交换器
	 * @return
	 *//*
	@Bean
	public Binding bindLogExchange(@Qualifier(CommonConstrant.RABBITMQ_LOG_QUEUE_NAME)Queue logQueue, 
			@Qualifier(CommonConstrant.RABBITMQ_LOG_EXCHANGE_NAME) FanoutExchange logExchange) {
		*//**
		 * 配置绑定，将广播式日志交换器与日志队列绑定
		 *//*
		return BindingBuilder.bind(logQueue).to(logExchange);
	}*/
    
}
