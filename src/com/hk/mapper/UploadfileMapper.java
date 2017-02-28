package com.hk.mapper;

import com.hk.bean.Uploadfile;
import com.hk.bean.UploadfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadfileMapper {
    int countByExample(UploadfileExample example);

    int deleteByExample(UploadfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Uploadfile record);

    int insertSelective(Uploadfile record);

    List<Uploadfile> selectByExample(UploadfileExample example);

    Uploadfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Uploadfile record, @Param("example") UploadfileExample example);

    int updateByExample(@Param("record") Uploadfile record, @Param("example") UploadfileExample example);

    int updateByPrimaryKeySelective(Uploadfile record);

    int updateByPrimaryKey(Uploadfile record);
}