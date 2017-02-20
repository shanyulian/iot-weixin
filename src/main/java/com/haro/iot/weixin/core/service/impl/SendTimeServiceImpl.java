package com.haro.iot.weixin.core.service.impl;

import com.alibaba.fastjson.JSON;
import com.haro.iot.weixin.core.mapper.SendTimeMapper;
import com.haro.iot.weixin.core.pojo.SendTime;
import com.haro.iot.weixin.core.service.SendTimeService;
import com.haro.iot.weixin.core.service.SendWeiXinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/19 下午12:47
 * @Version V1.0
 */
@Service("sendTimeService")
public class SendTimeServiceImpl implements SendTimeService{
    @Autowired
    private SendTimeMapper sendTimeMapper;
    @Override
    public SendTime selectTimeByCpsb(String cpsn) {
        return sendTimeMapper.selectTimeByCpsn(cpsn);
    }

    @Override
    public void insert(SendTime sendTime) {
        sendTimeMapper.insert(sendTime);
    }

    @Override
    public boolean sendStatus(String cpsn) {

        SendTime sendTime = sendTimeMapper.selectTimeByCpsn(cpsn);
        //第一次发送
        if(sendTime == null){
            sendTime = new SendTime();
            sendTime.setCpsn(cpsn);
            sendTime.setIntervalTime(20);//时间间隔
            Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
            sendTime.setTimestamp(now);
            sendTimeMapper.insert(sendTime);
            return true;
        }else {
            Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
            long i = (now.getTime()-sendTime.getTimestamp().getTime())/(1000*60);
            if(i > sendTime.getIntervalTime()){
                sendTime.setTimestamp(now);
                sendTimeMapper.updateSendTime(sendTime);
                return true;
            }else{
                return false;
            }

        }


    }
}
