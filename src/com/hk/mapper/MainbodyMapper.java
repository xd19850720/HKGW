package com.hk.mapper;

import com.hk.bean.Mainbody;
import com.hk.bean.MainbodyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainbodyMapper {
    int countByExample(MainbodyExample example);

    int deleteByExample(MainbodyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mainbody record);

    int insertSelective(Mainbody record);

    List<Mainbody> selectByExample(MainbodyExample example);

    Mainbody selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mainbody record, @Param("example") MainbodyExample example);

    int updateByExample(@Param("record") Mainbody record, @Param("example") MainbodyExample example);

    int updateByPrimaryKeySelective(Mainbody record);

    int updateByPrimaryKey(Mainbody record);
}