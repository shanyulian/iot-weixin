package com.haro.iot.weixin.core.service;

import com.haro.iot.weixin.core.pojo.SendTime;

import java.sql.Timestamp;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/19 下午12:46
 * @Version V1.0
 */
public interface SendTimeService {

    /**
     *
     * @param cpsn
     * @return
     */
    SendTime selectTimeByCpsb(String cpsn);

    /**
     *
     * @param sendTime
     */

    void insert(SendTime sendTime);

    /**
     *
     * @param cpsn
     * @return
     */
    boolean sendStatus(String cpsn);
}
