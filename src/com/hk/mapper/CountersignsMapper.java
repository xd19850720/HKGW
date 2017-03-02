package com.hk.mapper;

import com.hk.bean.Countersigns;
import com.hk.bean.CountersignsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountersignsMapper {
    int countByExample(CountersignsExample example);

    int deleteByExample(CountersignsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Countersigns record);

    int insertSelective(Countersigns record);

    List<Countersigns> selectByExample(CountersignsExample example);

    Countersigns selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Countersigns record, @Param("example") CountersignsExample example);

    int updateByExample(@Param("record") Countersigns record, @Param("example") CountersignsExample example);

    int updateByPrimaryKeySelective(Countersigns record);

    int updateByPrimaryKey(Countersigns record);
}