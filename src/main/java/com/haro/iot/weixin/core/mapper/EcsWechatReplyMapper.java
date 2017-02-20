package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.EcsWechatReply;
import com.haro.iot.weixin.core.pojo.EcsWechatReplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EcsWechatReplyMapper {
    int countByExample(EcsWechatReplyExample example);

    int deleteByExample(EcsWechatReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsWechatReply record);

    int insertSelective(EcsWechatReply record);

    List<EcsWechatReply> selectByExample(EcsWechatReplyExample example);

    EcsWechatReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsWechatReply record, @Param("example") EcsWechatReplyExample example);

    int updateByExample(@Param("record") EcsWechatReply record, @Param("example") EcsWechatReplyExample example);

    int updateByPrimaryKeySelective(EcsWechatReply record);

    int updateByPrimaryKey(EcsWechatReply record);

    String selectContentByType(String type);
}