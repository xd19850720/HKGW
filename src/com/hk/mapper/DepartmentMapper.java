package com.hk.mapper;

import com.hk.bean.Department;

public interface DepartmentMapper {

	int deleteByPrimaryKey(Integer deptid);

	int insert(Department record);

	int insertSelective(Department record);

}