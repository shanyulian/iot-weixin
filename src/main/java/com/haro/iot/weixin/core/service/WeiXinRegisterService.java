package com.haro.iot.weixin.core.service;

import com.haro.iot.weixin.core.pojo.TWeixinRegister;

/**
 * @Title:
 * @Description:微信注册命令
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/20 下午4:29
 * @Version V1.0
 */
public interface WeiXinRegisterService {

    /**
     *
     * @param agentId
     * @return
     */
    TWeixinRegister selectByAgent(String agentId);

}
