package com.haro.iot.weixin.core.service.impl;

import com.haro.iot.weixin.core.mapper.SendWeiXinInfoMapper;
import com.haro.iot.weixin.core.pojo.CustomerInfo;
import com.haro.iot.weixin.core.pojo.DeviceInfo;
import com.haro.iot.weixin.core.pojo.WeiXinInfo;
import com.haro.iot.weixin.core.service.SendWeiXinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shan on 2017/2/16.
 */
@Service("sendWeiXinService")
public class SendWeiXinServiceImpl implements SendWeiXinService {

    @Autowired
    private SendWeiXinInfoMapper sendWeiXinInfoMapper;
    @Override
    public DeviceInfo selectDeviceByCpsn(String cpsn) {
        return sendWeiXinInfoMapper.selectAgentIDByCpsn(cpsn);
    }

    @Override
    public WeiXinInfo selectWeiXinByID(Long id) {
        return sendWeiXinInfoMapper.selectWeiXinByID(id);
    }

    @Override
    public CustomerInfo selectCustomerByID(int id) {
        return  sendWeiXinInfoMapper.selectCustomerByID(id);
    }
}
