package com.haro.iot.weixin.core.service.impl;

import com.haro.iot.weixin.core.mapper.VEInfoMapper;
import com.haro.iot.weixin.core.pojo.VEInfo;
import com.haro.iot.weixin.core.service.DeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shan on 2017/2/15.
 */
@Service("deviceInfoService")
public class DeviceInfoServiceImpl implements DeviceInfoService{

    @Autowired
    private VEInfoMapper veInfoMapper;
    @Override
    public VEInfo selectById(int id) {
      return   veInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public VEInfo selectByCpsn(String cpsn) {
        return veInfoMapper.selectByCpsn(cpsn);
    }
}
