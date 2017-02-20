package weixin;

import com.alibaba.fastjson.JSON;

import com.haro.iot.weixin.core.pojo.*;
import com.haro.iot.weixin.core.service.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


@RunWith(SpringJUnit4ClassRunner.class)
 //配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
 @ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class MyBatisTest {
	 private static final Logger LOGGER = Logger.getLogger(MyBatisTest.class);
	//注入userService
//	@Autowired
//     private UserService userService;
//	@Autowired
//	private WeiXinReplyService weiXinReplyService;
//	@Autowired
//	private DeviceInfoService deviceInfoService;
//	@Autowired
//	private SendWeiXinService sendWeiXinService;
    @Autowired
	private WeiXinRegisterService weiXinRegisterService;
    //private SendTimeService sendTimeService;
	   //  @Test
	     public void testAddUser(){
//         TUser user = new TUser();
//         user.setUserAge("12dd3");
//         user.setUserName("OKKKK");
//
//	         userService.addUser(user);
	     }
	     
	     //@Test
	     public void testGetUserById(){
//         int userId = 2;
//	         TUser user = userService.getUserById(2);
//	         System.out.println(user.getUserName());
			// VEInfo veInfo = deviceInfoService.selectByCpsn("10160040");

			 //String s = weiXinReplyService.selectContent("subscribe");
//	         LOGGER.info("现实的信息："+JSON.toJSON(veInfo));
//			 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			 String parse = dateFormat.format(veInfo.getDate());
//			 System.out.println("获得的时间信息："+veInfo.getDate().toString());
//			 System.out.println("获得的时间信息："+veInfo.getDate().getHours());
//			 System.out.println("获得的时间信息："+veInfo.getDate().toLocaleString());
//			 System.out.println("获得的时间信息："+parse);
     }
	   //  @Test
	     public void ts(){
//	    	 IotMachineStatus iotMachineStatus = new IotMachineStatus();
//	    	 iotMachineStatus.setDeviceInfo(1);
//	    	 iotMachineStatus.setDeviceName("1234");
//	    	 iotMachineStatus.setDeviceStatus(1);
//	    	 iotMachineStatusService.updataMachineStatus(iotMachineStatus);
			// DeviceInfo deviceInfo = sendWeiXinService.selectDeviceByCpsn("10160049");
			// CustomerInfo customerInfo = sendWeiXinService.selectCustomerByID(102);
			// WeiXinInfo weiXinInfo = sendWeiXinService.selectWeiXinByID("10200");
			 //LOGGER.info("deviceInfo的信息："+JSON.toJSON(weiXinInfo));

	     }
	     @Test
		public  void e(){
//			 Jedis jedis = jedisPool.getResource();
//
//			// jedis.set("name", "单雨连");
//			 String name = jedis.get("name");
//			 System.out.println(name);
			 TWeixinRegister tWeixinRegister = weiXinRegisterService.selectByAgent("10200");
			 LOGGER.info("现实的信息："+JSON.toJSON(tWeixinRegister));

		 }
        @Test
		 public  void sentTime(){
//             SendTime se = sendTimeService.selectTimeByCpsb("10110600");
//             LOGGER.info("deviceInfo的信息："+JSON.toJSON(se));
//            Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
//            long i = (now.getTime()-se.getTimestamp().getTime())/(1000*60);
//            LOGGER.info("当前时间信息："+JSON.toJSON(now));
//            System.out.println("时间间隔："+i);
//            SendTime sendTime =new SendTime();
//            sendTime.setCpsn("10112233");
//            sendTime.setTimestamp(now);
//            sendTimeService.insert(sendTime);
//            if(!sendTimeService.sendStatus("10110111")){
//                System.out.println("=======================不可以发送========");
//            }else{
//                System.out.println("=======================可以发送========");
//            }

         }
}
