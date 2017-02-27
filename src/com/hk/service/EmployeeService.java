package com.hk.service;

import java.util.List;
import java.util.Map;

import com.hk.bean.EmployeeQuery;

public interface EmployeeService {
	public void add(EmployeeQuery query);

	public Map<String, Object> getAllEmployees();

	public Map<String, Object> getEmployees(EmployeeQuery query);

	public void editEmployee(EmployeeQuery query);

	public void deleleEmployees(List<Integer> ids);

	public Map<String, Object> getEmployeesByConditions(EmployeeQuery query);

}
