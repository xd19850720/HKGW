package com.hk.mapper;

import com.hk.bean.Copydepartments;
import com.hk.bean.CopydepartmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CopydepartmentsMapper {
    int countByExample(CopydepartmentsExample example);

    int deleteByExample(CopydepartmentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Copydepartments record);

    int insertSelective(Copydepartments record);

    List<Copydepartments> selectByExample(CopydepartmentsExample example);

    Copydepartments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Copydepartments record, @Param("example") CopydepartmentsExample example);

    int updateByExample(@Param("record") Copydepartments record, @Param("example") CopydepartmentsExample example);

    int updateByPrimaryKeySelective(Copydepartments record);

    int updateByPrimaryKey(Copydepartments record);
}