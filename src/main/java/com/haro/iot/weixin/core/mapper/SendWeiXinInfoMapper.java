package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.CustomerInfo;
import com.haro.iot.weixin.core.pojo.DeviceInfo;
import com.haro.iot.weixin.core.pojo.WeiXinInfo;

/**
 * Created by shan on 2017/2/16.
 */
public interface SendWeiXinInfoMapper {
    /**
     *根据SN👌 查询代理商的信息
     * @param cpsn
     * @return
     */
    DeviceInfo selectAgentIDByCpsn(String cpsn);

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
    WeiXinInfo selectWeiXinByID(Long id);
}
