package com.haro.iot.weixin.core.service;

import com.haro.iot.weixin.core.pojo.TMyorder;

/**
 * @Title:
 * @Description:订单管理系统
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/3/9 下午12:29
 * @Version V1.0
 */

public interface OrderService {

    int selectStatusByOuttradeno(String outtradeno);

    void saveOrder(TMyorder tMyorder);
}
