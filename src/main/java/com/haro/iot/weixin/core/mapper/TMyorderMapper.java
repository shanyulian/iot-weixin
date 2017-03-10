package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.TMyorder;
import com.haro.iot.weixin.core.pojo.TMyorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMyorderMapper {
    int countByExample(TMyorderExample example);

    int deleteByExample(TMyorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMyorder record);

    int insertSelective(TMyorder record);

    List<TMyorder> selectByExample(TMyorderExample example);

    TMyorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMyorder record, @Param("example") TMyorderExample example);

    int updateByExample(@Param("record") TMyorder record, @Param("example") TMyorderExample example);

    int updateByPrimaryKeySelective(TMyorder record);

    int updateByPrimaryKey(TMyorder record);

    int selectOrderStatus(String outtradeno);
}