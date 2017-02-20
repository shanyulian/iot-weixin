package com.haro.iot.weixin.core.service.impl;

import com.haro.iot.weixin.core.mapper.TWeixinRegisterMapper;
import com.haro.iot.weixin.core.pojo.TWeixinRegister;
import com.haro.iot.weixin.core.service.WeiXinRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/20 下午4:31
 * @Version V1.0
 */
@Service("weiXinRegisterService")
public class WeiXinRegisterServiceImpl implements WeiXinRegisterService {

    @Autowired
    private TWeixinRegisterMapper tWeixinRegisterMapper;

    /**
     * 更加代理商ID（agentID）查询
     * @param agentId
     * @return
     */
    @Override
    public TWeixinRegister selectByAgent(String agentId) {
        return tWeixinRegisterMapper.selectByAgent(agentId);
    }
}
