package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.TWeixinUser;
import com.haro.iot.weixin.core.pojo.TWeixinUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TWeixinUserMapper {
    int countByExample(TWeixinUserExample example);

    int deleteByExample(TWeixinUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWeixinUser record);

    int insertSelective(TWeixinUser record);

    List<TWeixinUser> selectByExample(TWeixinUserExample example);

    TWeixinUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWeixinUser record, @Param("example") TWeixinUserExample example);

    int updateByExample(@Param("record") TWeixinUser record, @Param("example") TWeixinUserExample example);

    int updateByPrimaryKeySelective(TWeixinUser record);

    int updateByPrimaryKey(TWeixinUser record);
}