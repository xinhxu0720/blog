package com.visionvera.mq.provider;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import com.visionvera.constrant.CommonConstrant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class RabbitProvider {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	/** 
	* @Description: 往RabbitMQ中推送用户消息
	* @Param: [] 
	* @return: void
	* @Author: 徐鑫辉
	* @Date: 16:47 2019/10/12
	*/ 
	
	public void sendNetWorkMessage(Object object){
		try {
			/**
			 * 第一个参数是交换机名称，第二个参数Routing Key，第三个参数是要推送的数据
			 */
			this.rabbitTemplate.convertAndSend(CommonConstrant.RABBIT_NETWORK_EXCHANGE_NAME,CommonConstrant.RABBIT_NETWORK_EXCHANGE_QUEUE_ROUTINGKEY_NAME,	JSONObject.toJSONString(object));
			LOGGER.info("推送的消息是:  "+object);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void sendToMatchQueue(String queueName , byte[] messageJsonObject , Integer i,boolean createQueue){
		Channel channel = null;
        try {
        	channel = this.rabbitTemplate.getConnectionFactory().createConnection().createChannel(true);
        	//判断是否创建队列，如果队列不存在，则不向该队列中插入数据
        	if(createQueue){
        		channel.queueDeclare(queueName, true, false, true, null) ;
        	}
        	channel.queueBind(queueName, CommonConstrant.RABBITMQ_BUSINESS_EXCHANGE_NAME, queueName);
        	
        	this.rabbitTemplate.setQueue(queueName);
        	this.rabbitTemplate.convertAndSend(CommonConstrant.RABBITMQ_BUSINESS_EXCHANGE_NAME,queueName, messageJsonObject);
        } catch (IOException e) {
        	e.printStackTrace();
        	this.LOGGER.error(queueName+" 队列不存在，则不向该队列中插入数据。");
        }catch (Exception e) {
			this.LOGGER.error("BusinessProvider ===== sendToMatchQueue ===== 向队列中发送数据失败, 操作类型:{} + " + i + " =====> ", e);
		} finally {
			if (channel != null) {
				try {
					channel.abort();
				} catch (IOException e) {
					this.LOGGER.error("BusinessProvider ===== sendToMatchQueue ===== 关闭通道失败", e);
				}
			}
		}
	}
	public void sendToMatchQueue(String queueName , byte[] messageJsonObject , Integer i){
		this.sendToMatchQueue(queueName, messageJsonObject, i,true);
	}

}
