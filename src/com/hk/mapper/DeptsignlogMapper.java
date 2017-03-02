package com.hk.mapper;

import com.hk.bean.Deptsignlog;
import com.hk.bean.DeptsignlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptsignlogMapper {
    int countByExample(DeptsignlogExample example);

    int deleteByExample(DeptsignlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deptsignlog record);

    int insertSelective(Deptsignlog record);

    List<Deptsignlog> selectByExample(DeptsignlogExample example);

    Deptsignlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deptsignlog record, @Param("example") DeptsignlogExample example);

    int updateByExample(@Param("record") Deptsignlog record, @Param("example") DeptsignlogExample example);

    int updateByPrimaryKeySelective(Deptsignlog record);

    int updateByPrimaryKey(Deptsignlog record);
}