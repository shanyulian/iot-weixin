package com.haro.iot.weixin.core.service;

import com.haro.iot.weixin.core.pojo.CustomerInfo;
import com.haro.iot.weixin.core.pojo.DeviceInfo;
import com.haro.iot.weixin.core.pojo.WeiXinInfo;

/**
 * Created by shan on 2017/2/16.
 */
public interface SendWeiXinService {
    /**
     *
     * @param cpsn
     * @return
     */
    DeviceInfo selectDeviceByCpsn(String cpsn);

    /**
     *
     * @param id
     * @return
     */
    CustomerInfo selectCustomerByID(int id);

    /**
     *
     * @param id
     * @return
     */
    WeiXinInfo selectWeiXinByID(String id);
}
