//import com.visionvera.application.AppServerApplication;
//import com.visionvera.bean.base.BaseReturn;
//import com.visionvera.bean.base.ReturnData;
//import com.visionvera.bean.cms.ScheduleVO;
//import com.visionvera.bean.cms.UserVO;
//import com.visionvera.bean.datacore.UserGroupingMidVO;
//import com.visionvera.bean.datacore.UserGroupingVO;
//import com.visionvera.bean.datacore.UserHgVO;
//import com.visionvera.bean.restful.client.RestClient;
//import com.visionvera.bean.ywcore.Vtersvrcountchangeb;
//import com.visionvera.config.SysConfig;
//import com.visionvera.constrant.WsConstants;
//import com.visionvera.dao.JRedisDao;
//import com.visionvera.dao.cms.DataCoreDeviceDao;
//import com.visionvera.dao.cms.ScheduleDao;
//import com.visionvera.dao.dispatchment.CommentsDao;
//import com.visionvera.dao.v2vdatacore.TeminalinfobDao;
//import com.visionvera.dao.v2vdatacore.UserDao;
//import com.visionvera.dao.v2vdatacore.UserGroupingDao;
//import com.visionvera.dao.ywcore.AlarDao;
//import com.visionvera.dao.ywcore.HeadlinesDao;
//import com.visionvera.dao.ywcore.TrmbusstatebDao;
//import com.visionvera.dao.ywcore.VtersvrcountchangebDao;
//import com.visionvera.exception.BusinessException;
//import com.visionvera.feign.UserService;
//import com.visionvera.service.NetWorkService;
//import com.visionvera.service.UserGroupingService;
//import com.visionvera.util.MeetUtil;
//import com.visionvera.util.StringUtil;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.poi.ss.formula.functions.T;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.CollectionUtils;
//
//import javax.annotation.Resource;
//import java.util.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = AppServerApplication.class)
//public class RedisTest {
//
//    @Autowired
//    private JRedisDao jedisDao;
//
//
//
//    @Autowired
//    private UserService userService;
//
//
//    @Autowired
//    UserGroupingService userGroupingService;
//
//
//
//    @Test
//    public void getTest() {
//        String value = this.jedisDao.get("auth_web_token_24ec9fbdc3b741869a1b17a0e55ffd09");
//        System.out.println("结果：" + value);
//        List<String> cc = jedisDao.mget("cc");
//        System.out.println(cc);
//    }
//
//    @Test
//    public void rewrew(){
//        long userInfo = jedisDao.delObject("UserInfo");
//        System.out.println(userInfo);
//       // this.jedisDao.delList("UserInfo");
//    }
//
//
//    @Test
//    public void setTest() {
//        Object key = jedisDao.getObject("key");
//        System.out.println(key);
//
//    }
//
//
//    public String ewqeq(){
//
//        String cc ="1100000008819";
//        String substring = cc.substring(2);
//        int num =0;
//        for(int b =0;b<substring.length();b++){
//            if(String.valueOf(substring.charAt(num)).equals("0")){
//                num++;
//            }else {
//                return substring.substring(num);
//            }
//        }
//        return null;
//
//    }
//
//    @Autowired
//    SysConfig sysConfig;
//
// @Autowired
//    UserDao userDao;
//
//
//
//
//
//    @Test
//    public void rerqw(){
//        StringBuilder cc= new StringBuilder();
//        cc.append("csa");
//        cc.append("ccc");
//        System.out.println(cc);
//    }
//    @Autowired
//    VtersvrcountchangebDao vtersvrcountchangebDao;
//    @Test
//    public void rwerwe(){
//        Vtersvrcountchangeb cc = new Vtersvrcountchangeb();
//        cc.setPid("000000000000");
//        List<Vtersvrcountchangeb> vtersvrcountchangebs = vtersvrcountchangebDao.selectEntityDevInfo(cc);
//        System.out.println(vtersvrcountchangebs);
//    }
//
//    @Autowired
//    ScheduleDao scheduleDao;
//    @Test
//    public void  test1(){
//        Map<String, Object> paramsMap = new HashMap<String, Object>();
//        paramsMap.put("devNo",10000008368L);
//        List<ScheduleVO> devicesMeetingDetail = scheduleDao.getDevicesMeetingDetail(paramsMap);
//        System.out.println(devicesMeetingDetail);
//    }
//
//
//    }
//
//
//
