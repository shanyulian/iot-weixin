package com.haro.iot.weixin.core.mapper;

import com.haro.iot.weixin.core.pojo.VEInfo;
import com.haro.iot.weixin.core.pojo.VEInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VEInfoMapper {
    int countByExample(VEInfoExample example);

    int deleteByExample(VEInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VEInfo record);

    int insertSelective(VEInfo record);

    List<VEInfo> selectByExample(VEInfoExample example);

    VEInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VEInfo record, @Param("example") VEInfoExample example);

    int updateByExample(@Param("record") VEInfo record, @Param("example") VEInfoExample example);

    int updateByPrimaryKeySelective(VEInfo record);

    int updateByPrimaryKey(VEInfo record);

    VEInfo selectByCpsn(String cpsn);

    VEInfo selectByDTU(String txsn);
}