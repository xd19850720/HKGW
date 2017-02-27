package com.hk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.DepartmentQuery;
import com.hk.mapper.DepartmentMapper;
import com.hk.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	@Qualifier("departmentMapper")
	private DepartmentMapper departmentMapper;

	@Override
	public void add(DepartmentQuery query) {
		departmentMapper.insertSelective(query);
	}
}
