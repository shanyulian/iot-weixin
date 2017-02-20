package com.haro.iot.weixin.core.service.impl;

import com.haro.iot.weixin.core.mapper.EcsWechatReplyMapper;
import com.haro.iot.weixin.core.service.WeiXinReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by shan on 2017/2/14.
 */
@Service("weiXinReplyService")
public class WeiXinReplyServiceImpi implements WeiXinReplyService{

    @Autowired
    private EcsWechatReplyMapper ecsWechatReplyMapper;//注入dao
    @Override
    public String selectContent(String type) {
        return  ecsWechatReplyMapper.selectContentByType(type);
    }
}
