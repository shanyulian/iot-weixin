package com.haro.iot.weixin.core.service;

/**
 * Created by shan on 2017/2/14.
 * 微信回复是service
 */
public interface WeiXinReplyService {

    /**
     * '
     * @param type 根据信息类型查询内容
     * @return 内容
     */
    String selectContent(String type);
}
