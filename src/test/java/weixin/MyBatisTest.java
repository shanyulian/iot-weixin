package weixin;

import com.alibaba.fastjson.JSON;

import com.haro.iot.weixin.core.pojo.*;
import com.haro.iot.weixin.core.service.*;
import com.haro.iot.weixin.tools.service.WeixinService;
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
//    @Autowired
//	private WeiXinRegisterService weiXinRegisterService;
//	@Autowired
//    private SendTimeService sendTimeService;
	@Autowired
	private WeixinService wxService;
	@Autowired
	private SendWeiXinService sendWeiXinService;
	@Autowired
	private SendTimeService sendTimeService;//时间间隔查询
	@Autowired
	private OrderService orderService;
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
			 //TWeixinRegister tWeixinRegister = weiXinRegisterService.selectByAgent("10200");
			// LOGGER.info("现实的信息："+JSON.toJSON(tWeixinRegister));
			 /**
			  * (2)通过SN号查询机器信息
			  */
			 DeviceInfo deviceInfo = sendWeiXinService.selectDeviceByCpsn("20170004");

			 if(deviceInfo==null){
				 return;
			 }
			 /**
			  * (3)获取机器种类
			  */
			 String deviceType = deviceInfo.getSpec();//机器种类
			 LOGGER.info("获取机器种类========："+deviceType);
			 /**
			  * (4)获取客户ID，异常可能客户为null，或者为0
			  */
			 String address = "";//机器地址
			 if(deviceInfo.getcID()!=null){
				 CustomerInfo customerInfo = sendWeiXinService.selectCustomerByID(deviceInfo.getcID());
				 if(customerInfo!=null){
					 address= customerInfo.getName();//机器地址
				 }
			 }
			 LOGGER.info("获取机器地址========："+address);
			 LOGGER.info("获ID========："+deviceInfo.getdID());
			 LOGGER.info("现实的信息："+JSON.toJSON(deviceInfo));

			 // String address =
//            String code = StringUtil.subStrNotEncode(customerInfo.getCode(),5);
//            System.out.print("addreess:"+address + "code:"+code);
//            WeiXinInfo weiXinInfo = sendWeiXinService.selectWeiXinByID(code);
			 WeiXinInfo weiXinInfo = sendWeiXinService.selectWeiXinByID(deviceInfo.getdID());
			 if(weiXinInfo == null){
				 LOGGER.info("6KKKKKKKKKKKKKKKKKKKKKKKKKKK");
				 return  ;
			 }
			 String openid ;
			 String agentName = weiXinInfo.getAgentName();
			 if(weiXinInfo.getOpenid()!= null){
				 openid = weiXinInfo.getOpenid();
			 }else {
				 openid = "oMooxwO9SdQaSxHDMtmhMXjHhpOg";
			 }
			 LOGGER.info("openid========："+openid);
			 LOGGER.info("agentName========："+agentName);
			 return  ;
		 }
        @Test
		 public  void sentTime(){
			String f = "E20170309081139";
			int s = orderService.selectStatusByOuttradeno(f);

			System.out.println("=======================查询订单结果========"+s+"  结果");

//             SendTime se = sendTimeService.selectTimeByCpsb("20160006");
//             LOGGER.info("deviceInfo的信息："+JSON.toJSON(se));
//            Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
//            long i = (now.getTime()-se.getTimestamp().getTime())/(1000*60);
//            LOGGER.info("当前时间信息："+JSON.toJSON(now));
//            System.out.println("时间间隔："+i);
//            SendTime sendTime =new SendTime();
//            sendTime.setCpsn("10112233");
//            sendTime.setTimestamp(now);
//            sendTimeService.insert(sendTime);
//            if(!sendTimeService.sendStatus("20160006")){
//                System.out.println("=======================不可以发送========");
//            }else{
//                System.out.println("=======================可以发送========");
//            }

         }
}
