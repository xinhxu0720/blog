package com.visionvera.config;

import com.visionvera.constrant.CommonConstrant;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置RabbitMQ
 *
 */
//@Configuration
public class RabbitMQConfig {
	

	/**
	* @Description: 建立网管队列
	* @Param: []
	* @return: org.springframework.amqp.core.Queue 
	* @Author: 徐鑫辉
	* @Date: 16:32 2019/10/12
	*/
	
	@Bean(name = CommonConstrant.RABBIT_NETWORK_QUEUE_NAME)
	public Queue netWorkQueue() {
		/**
		 * 第一个参数为队列名称，第二个参数表示消息是否持久化
		 * 第三个参数表示是否独占队列: 即断开后是否自动删除
		 * 第四个参数表示当所有消费者客户端连接断开时是否自动删除队列
		 * 第五个参数表示Map类型的其他参数
		 */
		return new Queue(CommonConstrant.RABBIT_NETWORK_QUEUE_NAME, true, false, false, null);
	}



	/** DirectExchange 表示直连式交换机 直连交换机是一种带路由功能的交换机，一个队列会和一个交换机绑定，除此之外再绑定一个routing_key，
	 * 当消息被发送的时候，需要指定一个binding_key，这个消息被送达交换机的时候，
	 * 就会被这个交换机送到指定的队列里面去。同样的一个binding_key也是支持应用到多个队列中的
	 *
	 * FanoutExchange 表示广播式交换器 扇形交换机会把能接收到的消息全部发送给绑定在自己身上的所有队列
	 *
	 * TopicExchange 主题交换机的routing_key需要有一定的规则，交换机和队列的binding_key需要采用*.#.*.....的格式，每个部分用.分开，
	 * 其中：*表示一个单词，#表示任意数量（零个或多个）单词。
	 * 假设有一条消息的routing_key为fast.rabbit.white,那么带有这样binding_key的几个队列都会接收这条消息：
	 * fast..\..white\fast.#\……
	 *
	 * HeadersExchange 首部交换机是忽略routing_key的一种路由方式。路由器和交换机路由的规则是通过Headers信息来交换的，
	 * 这个有点像HTTP的Headers。将一个交换机声明成首部交换机，绑定一个队列的时候，定义一个Hash的数据结构，消息发送的时候，
	 * 会携带一组hash数据结构的信息，当Hash的内容匹配上的时候，消息就会被写入队列。绑定交换机和队列的时候，Hash结构中要求携带一个键“x-match”，
	 * 这个键的Value可以是any或者all，这代表消息携带的Hash是需要全部匹配(all)，还是仅匹配一个键(any)就可以了。相比直连交换机，
	 * 首部交换机的优势是匹配的规则不被限定为字符串(string)。
	 */

	 /**
	* @Description:  建立网管直连式交换机
	* @Param: []
	* @return: org.springframework.amqp.core.DirectExchange 
	* @Author: 徐鑫辉
	* @Date: 16:31 2019/10/12
	*/
	
	@Bean(name = CommonConstrant.RABBIT_NETWORK_EXCHANGE_NAME)
	public DirectExchange netWorkExchange() {
		/**
		 * 第一个参数表示交换机名称，第二个参数表示是否持久化，第三个参数表示断开后是否自动删除
		 */
		return new DirectExchange(CommonConstrant.RABBIT_NETWORK_EXCHANGE_NAME, true, false);
	}
	

	/**
	* @Description:  配置网管交换机与网管队列绑定
	* @Param: [netWorkQueue, netWorkExchange] 
	* @return: org.springframework.amqp.core.Binding 
	* @Author: 徐鑫辉
	* @Date: 16:33 2019/10/12
	*/
	
	@Bean
	public Binding bindNetWorkExchange(@Qualifier(CommonConstrant.RABBIT_NETWORK_QUEUE_NAME) Queue netWorkQueue,
									   @Qualifier(CommonConstrant.RABBIT_NETWORK_EXCHANGE_NAME) DirectExchange netWorkExchange) {
		/**
		 * 配置绑定:第一个参数队列名称，第二个参数交换机名称，第三个参数Routing key
		 */
		return BindingBuilder.bind(netWorkQueue).to(netWorkExchange).with(CommonConstrant.RABBIT_NETWORK_EXCHANGE_QUEUE_ROUTINGKEY_NAME);
	}

	

}
