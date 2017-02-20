package com.haro.iot.weixin.tools.controller;


import com.haro.iot.weixin.core.pojo.CustomerInfo;
import com.haro.iot.weixin.core.pojo.DeviceInfo;
import com.haro.iot.weixin.core.pojo.WeiXinInfo;
import com.haro.iot.weixin.core.service.SendTimeService;
import com.haro.iot.weixin.core.service.SendWeiXinService;
import com.haro.iot.weixin.tools.service.WeixinService;
import com.haro.iot.weixin.util.StringUtil;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shan on 2017/2/15.
 */
@Controller
@RequestMapping("/send")
public class SendTemplateMessage {
    @Autowired
    private WeixinService wxService;
    @Autowired
    private SendWeiXinService sendWeiXinService;
    @Autowired
    private SendTimeService sendTimeService;//时间间隔查询
    @ResponseBody
    @GetMapping(produces = "text/plain;charset=utf-8")
    public String authGet(@RequestParam(name = "cpsn", required = false) String cpsn,
                          @RequestParam(name = "info", required = false) String info,
                          @RequestParam(name = "user", required = false) String user,
                          @RequestParam(name = "password", required = false) String password
                          ) {
        if(cpsn.length()!=8){
            return "cpsn error";
        }
        if( info.length()!=2) {
            return "info error";
        }
        if("klfj".equals(user) && "klfj".equals(password)){
            if(!sendTimeService.sendStatus(cpsn)){
                return "";
            }
            DeviceInfo deviceInfo = sendWeiXinService.selectDeviceByCpsn(cpsn);
            if(deviceInfo==null){
                return "no cpsn";
            }
            String deviceType = deviceInfo.getSpec();//机器种类

            CustomerInfo customerInfo = sendWeiXinService.selectCustomerByID(deviceInfo.getcID());
            if(customerInfo==null){
                return "no customer";
            }
            String address = customerInfo.getName();//机器地址
            String code = StringUtil.subStrNotEncode(customerInfo.getCode(),5);
            System.out.print("addreess:"+address + "code:"+code);
            WeiXinInfo weiXinInfo = sendWeiXinService.selectWeiXinByID(code);
            if(weiXinInfo == null){
                return  "no weixin";
            }
            String openid ;
            String agentName = weiXinInfo.getAgentName();
            if(weiXinInfo.getOpenid()!= null){
                openid = weiXinInfo.getOpenid();
            }else {
                openid = "oMooxwO9SdQaSxHDMtmhMXjHhpOg";
            }
            WxMpTemplateMessage templateMessage = new WxMpTemplateMessage();
            templateMessage.setToUser(openid);//发送的OpenID
            templateMessage.setTemplateId("XNxPXDGOcFyRTKt6kXIM8ynowkcdyR5wQo66BSZu8T4");//发送的模板，微信提供
            templateMessage.setUrl("www.qdwh-sh.com");//网页
            templateMessage.getData().add(new WxMpTemplateData("first", agentName+",机器运行状态提示\n", "#FF0022"));
            templateMessage.getData().add(new WxMpTemplateData("keyword1", cpsn, "#000000"));
            templateMessage.getData().add(new WxMpTemplateData("keyword2", deviceType, "#000000"));
            String sendInfo=null;
            if("01".equals(info)){
                sendInfo ="缺水";
            }else if("02".equals(info)){
                sendInfo ="缺巾";
            }else if("03".equals(info)){
                sendInfo ="故障卡刀";
            }else if("04".equals(info)){
                sendInfo ="剩余不足";
            }else if("05".equals(info)){
                sendInfo ="择巾异常";
            }else if("06".equals(info)){
                sendInfo ="加热管故障";
            }else if("07".equals(info)){
                sendInfo ="加热水泵故障";
            }else if("08".equals(info)){
                sendInfo ="DTU报警";
            }else if("09".equals(info)){
                sendInfo ="已经上锁";
            }
            templateMessage.getData().add(new WxMpTemplateData("keyword3", sendInfo, "#000000"));
            templateMessage.getData().add(new WxMpTemplateData("keyword4", address, "#000000"));
            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");
            templateMessage.getData().add(new WxMpTemplateData("keyword5", dateFormat.format(new Date())+"\n", "#000000"));

            templateMessage.getData().add(new WxMpTemplateData("remark", "请您及时前往处理！" , "#FF0022"));
            //
            try {
                wxService.getTemplateMsgService().sendTemplateMsg(templateMessage);
                System.out.print("openid :"+ openid +",代理商："+agentName+",发送信息："+sendInfo+",address: "+address);
                if("10300".equals(code)) {
                    templateMessage.setToUser("oMooxwH5-5-ovgUetMsMKnQ6Cc28");//发送的陆总OpenID
                    wxService.getTemplateMsgService().sendTemplateMsg(templateMessage);
                    templateMessage.setToUser("oMooxwO9SdQaSxHDMtmhMXjHhpOg");//发送的单OpenID
                    wxService.getTemplateMsgService().sendTemplateMsg(templateMessage);
                }
            } catch (WxErrorException e) {
                e.printStackTrace();
            }
            // wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
            return "success";
        }
        else {
            return  "user error";
        }

    }
}
