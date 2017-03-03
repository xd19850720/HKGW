package com.hk.mapper;

import com.hk.bean.Senddocs;
import com.hk.bean.SenddocsExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SenddocsMapper {
    int countByExample(SenddocsExample example);

    int deleteByExample(SenddocsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Senddocs record);

    int insertSelective(Senddocs record);

    List<Senddocs> selectByExample(SenddocsExample example);
    
    List<Senddocs> selectAll();

    Senddocs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Senddocs record, @Param("example") SenddocsExample example);

    int updateByExample(@Param("record") Senddocs record, @Param("example") SenddocsExample example);

    int updateByPrimaryKeySelective(Senddocs record);

    int updateByPrimaryKey(Senddocs record);
    
    void updatestatusById(HashMap<String,String> map);
}