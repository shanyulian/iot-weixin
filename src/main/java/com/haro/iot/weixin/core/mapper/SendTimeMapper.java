package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.SendTime;

import java.sql.Timestamp;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/19 下午12:25
 * @Version V1.0
 */
public interface SendTimeMapper {

    /**
     *
     * @param cpsn
     * @return
     */
    SendTime selectTimeByCpsn (String cpsn);

    /**
     *
     * @param sendTime
     */
    void insert(SendTime sendTime) ;

    /**
     *
     * @param sendTime
     */
    void updateSendTime(SendTime sendTime);
}
