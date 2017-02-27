package com.hk.mapper;

import java.util.List;

import com.hk.bean.Employee;
import com.hk.bean.EmployeeQuery;

public interface EmployeeMapper {

	int insert(Employee record);

	public int insertSelective(Employee record);

	public List<EmployeeQuery> getAllEmployees();

	public List<EmployeeQuery> getEmployeesByPage(EmployeeQuery query);

	public Integer getEmployeesCount(EmployeeQuery query);

	public EmployeeQuery getEmployeeQueryById(Integer employeeId);

	// 查找最大的员工编号
	public EmployeeQuery getLastedEmployee();

	public void updateByPrimaryKeySelective(EmployeeQuery query);

	public void deleteEmployeesByIds(List<Integer> ids);

	// 根据条件查找员工
	public List<EmployeeQuery> getEmployeesByConditions(EmployeeQuery query);

	public int getEmployeesCountByConditions(EmployeeQuery query);

}