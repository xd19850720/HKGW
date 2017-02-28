package com.hk.mapper;

import com.hk.bean.Secretperiod;
import com.hk.bean.SecretperiodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretperiodMapper {
    int countByExample(SecretperiodExample example);

    int deleteByExample(SecretperiodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Secretperiod record);

    int insertSelective(Secretperiod record);

    List<Secretperiod> selectByExample(SecretperiodExample example);

    Secretperiod selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Secretperiod record, @Param("example") SecretperiodExample example);

    int updateByExample(@Param("record") Secretperiod record, @Param("example") SecretperiodExample example);

    int updateByPrimaryKeySelective(Secretperiod record);

    int updateByPrimaryKey(Secretperiod record);
}