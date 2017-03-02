package com.hk.mapper;

import java.util.List;

import com.hk.bean.Department;

public interface DepartmentMapper {

	int deleteByPrimaryKey(Integer deptid);

	int insert(Department record);

	int insertSelective(Department record);
	
	List<Department> getAll();
}