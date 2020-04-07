package com.visionvera.mq.consumer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.visionvera.constrant.CommonConstrant;
import com.visionvera.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 监听智能运维队列的消费者
 */


//@Component
//@RabbitListener(queues = CommonConstrant.RABBIT_NETWORK_QUEUE_NAME)
public class BusinessConsumer {
	private final static Logger LOGGER = LoggerFactory.getLogger(BusinessConsumer.class);

//	@Autowired
//	private ConsumerService consumerService;

	@RabbitHandler
	public void onMessage(String message) {
		try {
			JSONObject messageJson = JSONObject.parseObject(message, JSONObject.class, Feature.AutoCloseSource);
            System.out.println(messageJson);
//			if (messageJson == null) {
//				LOGGER.error("消息体为空");
//				return;
//			}
//
//			Integer operationType = messageJson.getInteger("operationType");
//
//			if (operationType == null || operationType.equals(0)) {
//				LOGGER.error("操作类型不能为空");
//				return;
//			} else {
//			//	this.consumerService.process(messageJson);//消息业务处理
//			}
		} catch (BusinessException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (Exception e) {
			LOGGER.error("消息处理异常!!!", e);
		}
	}
}
