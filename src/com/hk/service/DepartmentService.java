package com.hk.service;

import java.util.List;

import com.hk.bean.Department;
import com.hk.bean.DepartmentQuery;

public interface DepartmentService {
	public void add(DepartmentQuery query);
	
	public List<Department> getAll();
}
