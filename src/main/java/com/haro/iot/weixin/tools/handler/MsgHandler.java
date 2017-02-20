package com.haro.iot.weixin.tools.handler;


import com.haro.iot.weixin.core.pojo.CustomerInfo;
import com.haro.iot.weixin.core.pojo.DeviceInfo;
import com.haro.iot.weixin.core.pojo.VEInfo;
import com.haro.iot.weixin.core.service.DeviceInfoService;
import com.haro.iot.weixin.core.service.SendWeiXinService;
import com.haro.iot.weixin.tools.builder.TextBuilder;
import com.haro.iot.weixin.tools.service.WeixinService;
import com.haro.iot.weixin.util.SpringUtil;
import com.haro.iot.weixin.util.StringUtil;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * 
 * @author Binary Wang
 *
 */
@Component
public class MsgHandler extends AbstractHandler {

    @Autowired
    private DeviceInfoService deviceInfoService;//机器信息
    @Autowired
    private SendWeiXinService sendWeiXinService;//获取代理商等信息
    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
      Map<String, Object> context, WxMpService wxMpService,
            WxSessionManager sessionManager)    {

        WeixinService weixinService = (WeixinService) wxMpService;

        /**
         * 不是事件的，文字消息
         */
        if (!wxMessage.getMsgType().equals(WxConsts.XML_MSG_EVENT)) {
            //TODO 可以选择将消息保存到本地

        }
        /**
         * 是语音结果的话
         */
        if( wxMessage.getMsgType().equals(WxConsts.XML_MSG_VOICE)){
            System.out.println("语音的数字："+wxMessage.getRecognition());
            System.out.println("语音长度："+wxMessage.getRecognition().length());
            if(wxMessage.getRecognition().length() == 9){
                String voiceStr = StringUtil.subStrNotEncode(wxMessage.getRecognition(),8);
                if(StringUtil.isNumericString(voiceStr)){

                    String cpsn = voiceStr;
                    VEInfo veInfo = deviceInfoService.selectByCpsn(cpsn);
                    if (veInfo != null) {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String parse = dateFormat.format(veInfo.getDate());

                        StringBuilder sb = new StringBuilder();
                        sb.append("产品SN：" + veInfo.getCpsn() + "\n")
                                .append("DTU号：" + veInfo.getTxsn() + "\n")
                                .append("运行状态：" + veInfo.getBjzt() + "\n")
                                .append("总出巾量：" + veInfo.getZcjl() + "\n")
                                .append("剩余量：" + veInfo.getSyl() + "\n")
                                .append("新卷出巾量：" + veInfo.getXjcjl() + "\n")
                                .append("温度状态：：" + veInfo.getWdzt()+"\n");
                        if("断线".equals(veInfo.getZt())){
                            sb.append("状态：关机\n");
                        }else {
                            sb.append("状态："+veInfo.getZt()+"\n");
                        }
                        sb.append("最后出巾时间："+parse+"\n");

                        DeviceInfo deviceInfo = sendWeiXinService.selectDeviceByCpsn(cpsn);
                        if(deviceInfo!=null){
                            sb.append("机器类型："+deviceInfo.getSpec()+"\n");
                            if( deviceInfo.getcID() != null){
                                CustomerInfo customerInfo = sendWeiXinService.selectCustomerByID(deviceInfo.getcID());
                                if(customerInfo!=null){
                                    sb.append("机器地址："+customerInfo.getName());
                                }
                            }
                        }

                        String cont = sb.toString();
                        return new TextBuilder().build(cont, wxMessage, weixinService);
                    }
                }else{
                    String content = "语音识别结果："+wxMessage.getRecognition();
                    return new TextBuilder().build(content, wxMessage, weixinService);
                }
            }else {
                String content = "语音识别结果："+wxMessage.getRecognition();
                return new TextBuilder().build(content, wxMessage, weixinService);
            }
        }
        if(wxMessage.getContent()!=null ) {
            //信息长度为8 SN号长度为8位
            if (wxMessage.getContent().length() == 8 ) {
                //为纯数字组合
                if (StringUtil.isNumericString(wxMessage.getContent())) {
                    String cpsn = wxMessage.getContent();
                    VEInfo veInfo = deviceInfoService.selectByCpsn(cpsn);
                    if (veInfo != null) {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String parse = dateFormat.format(veInfo.getDate());

                        StringBuilder sb = new StringBuilder();
                        sb.append("产品SN：" + veInfo.getCpsn() + "\n")
                                .append("DTU号：" + veInfo.getTxsn() + "\n")
                                .append("运行状态：" + veInfo.getBjzt() + "\n")
                                .append("总出巾量：" + veInfo.getZcjl() + "\n")
                                .append("剩余量：" + veInfo.getSyl() + "\n")
                                .append("新卷出巾量：" + veInfo.getXjcjl() + "\n")
                                .append("温度状态：：" + veInfo.getWdzt()+"\n");
                        if("断线".equals(veInfo.getZt())){
                            sb.append("状态：关机\n");
                        }else {
                            sb.append("状态："+veInfo.getZt()+"\n");
                        }
                        sb.append("最后出巾时间："+parse+"\n");

                        DeviceInfo deviceInfo = sendWeiXinService.selectDeviceByCpsn(cpsn);
                        if(deviceInfo!=null){
                                sb.append("机器类型："+deviceInfo.getSpec()+"\n");
                                if( deviceInfo.getcID() != null){
                                CustomerInfo customerInfo = sendWeiXinService.selectCustomerByID(deviceInfo.getcID());
                                if(customerInfo!=null){
                                    sb.append("机器地址："+customerInfo.getName());
                                }
                            }
                        }

                        String cont = sb.toString();
                        return new TextBuilder().build(cont, wxMessage, weixinService);
                    }
                }
            }
        }else if(wxMessage.getContent().length() ==10){


        }else{
            String content = "没有解析到相应命令。直接输入机器SN编号查询对应机器信息！";
            return new TextBuilder().build(content, wxMessage, weixinService);
        }

        //当用户输入关键词如“你好”，“客服”等，并且有客服在线时，把消息转发给在线客服
        if (StringUtils.startsWithAny(wxMessage.getContent(), "你好", "客服")
            && weixinService.hasKefuOnline()) {
            return WxMpXmlOutMessage
                .TRANSFER_CUSTOMER_SERVICE().fromUser(wxMessage.getToUser())
                .toUser(wxMessage.getFromUser()).build();
        }

        //TODO 组装回复消息
        String content = "没有解析到相应命令。直接输入机器SN编号查询对应机器信息！";
        return new TextBuilder().build(content, wxMessage, weixinService);

    }

}
