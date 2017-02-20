package com.haro.iot.weixin.core.service;

import com.haro.iot.weixin.core.pojo.VEInfo;

/**
 * Created by shan on 2017/2/15.
 */
public interface DeviceInfoService {
    /**
     *
     * @param id
     * @return
     */
    VEInfo selectById(int id);

    /**
     *CPSN 查询
     */
    VEInfo selectByCpsn(String cpsn);
}
