/*
import com.alibaba.fastjson.JSONObject;
import com.visionvera.application.AppServerApplication;
import com.visionvera.bean.datacore.TLog;
import com.visionvera.constrant.CommonConstrant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

*/
/**
 * @ClassName RabbitMQ
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年10月10日 18:34
 **//*

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppServerApplication.class)
public class RabbitMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

//    public void sendLogMessage(Integer logType, String description, String createName, Boolean result, String platformId, String errMsg, String token) {
//        TLog log = new TLog();
//        try {
//            log = this.getLog(logType, description, createName, result, platformId, errMsg, token);
//            this.rabbitTemplate.convertAndSend(CommonConstrant.RABBITMQ_LOG_EXCHANGE_NAME, "logRoute", JSONObject.toJSONString(log));
//        } catch (Exception e) {//不处理异常
//            this.LOGGER.error("RabbitProvider ===== sendLogMessage ===== 向队列中发送日志数据(全字段)失败 =====> ", e);
//        }
//    }

    @Test
    public void ewqeqw(){
        this.rabbitTemplate.convertAndSend(CommonConstrant.RABBITMQ_LOG_EXCHANGE_NAME, "logRoute", "1231231");
    }

}
*/
