package com.hk.mapper;

import com.hk.bean.Secretlevel;
import com.hk.bean.SecretlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretlevelMapper {
    int countByExample(SecretlevelExample example);

    int deleteByExample(SecretlevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Secretlevel record);

    int insertSelective(Secretlevel record);

    List<Secretlevel> selectByExample(SecretlevelExample example);

    Secretlevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Secretlevel record, @Param("example") SecretlevelExample example);

    int updateByExample(@Param("record") Secretlevel record, @Param("example") SecretlevelExample example);

    int updateByPrimaryKeySelective(Secretlevel record);

    int updateByPrimaryKey(Secretlevel record);
}