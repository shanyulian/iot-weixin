package com.haro.iot.weixin.core.service.impl;

import com.haro.iot.weixin.core.mapper.TMyorderMapper;
import com.haro.iot.weixin.core.pojo.TMyorder;
import com.haro.iot.weixin.core.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/3/9 下午12:32
 * @Version V1.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    private TMyorderMapper tMyorderMapper;
    @Override
    public int selectStatusByOuttradeno(String outtradeno) {
        return tMyorderMapper.selectOrderStatus(outtradeno);
    }

    @Override
    public void saveOrder(TMyorder tMyorder) {
        tMyorderMapper.insertSelective(tMyorder);
    }
}
