package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.TWeixinRegister;
import com.haro.iot.weixin.core.pojo.TWeixinRegisterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TWeixinRegisterMapper {
    int countByExample(TWeixinRegisterExample example);

    int deleteByExample(TWeixinRegisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWeixinRegister record);

    int insertSelective(TWeixinRegister record);

    List<TWeixinRegister> selectByExample(TWeixinRegisterExample example);

    TWeixinRegister selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWeixinRegister record, @Param("example") TWeixinRegisterExample example);

    int updateByExample(@Param("record") TWeixinRegister record, @Param("example") TWeixinRegisterExample example);

    int updateByPrimaryKeySelective(TWeixinRegister record);

    int updateByPrimaryKey(TWeixinRegister record);

    TWeixinRegister selectByAgent(String agentId);
}