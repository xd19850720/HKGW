package com.hk.mapper;

import com.hk.bean.Mainsupplydep;
import com.hk.bean.MainsupplydepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainsupplydepMapper {
    int countByExample(MainsupplydepExample example);

    int deleteByExample(MainsupplydepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mainsupplydep record);

    int insertSelective(Mainsupplydep record);

    List<Mainsupplydep> selectByExample(MainsupplydepExample example);

    Mainsupplydep selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mainsupplydep record, @Param("example") MainsupplydepExample example);

    int updateByExample(@Param("record") Mainsupplydep record, @Param("example") MainsupplydepExample example);

    int updateByPrimaryKeySelective(Mainsupplydep record);

    int updateByPrimaryKey(Mainsupplydep record);
}