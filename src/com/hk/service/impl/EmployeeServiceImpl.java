package com.hk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.EmployeeQuery;
import com.hk.mapper.EmployeeMapper;
import com.hk.service.EmployeeService;
import com.hk.util.Util;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("employeeMapper")
	private EmployeeMapper employeeMapper;

	@Override
	public void add(EmployeeQuery employeeQuery) {
		// 插入数据
		employeeMapper.insertSelective(employeeQuery);

		// 设置员工编号
		Integer count = Util.getNumberCount(employeeQuery.getEmployeeid());
		String employeeCode = employeeQuery.getEmployeeid() + "";
		for (Integer i = 0; i < (4 - count); i++) {
			employeeCode = "0" + employeeCode;
		}
		employeeQuery.setEmployeecode("HK" + employeeCode);
		employeeQuery.setIsdel("1");
		employeeMapper.updateByPrimaryKeySelective(employeeQuery);
	}

	@Override
	public Map<String, Object> getAllEmployees() {
		List<EmployeeQuery> employeeQueries = employeeMapper.getAllEmployees();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", employeeQueries.size());
		map.put("rows", employeeQueries);
		return map;
	}

	@Override
	public Map<String, Object> getEmployees(EmployeeQuery query) {
		query.setStartIndex((query.getPage() - 1) * query.getRows());
		List<EmployeeQuery> employeeQueries = employeeMapper
				.getEmployeesByPage(query);
		Map<String, Object> map = new HashMap<String, Object>();
		Integer count = employeeMapper.getEmployeesCount(query);
		map.put("total", count);
		map.put("rows", employeeQueries);
		return map;
	}

	@Override
	public void editEmployee(EmployeeQuery query) {
		// TODO 修改验证
		employeeMapper.updateByPrimaryKeySelective(query);
	}

	// 删除操作
	@Override
	public void deleleEmployees(List<Integer> ids) {
		if (ids != null && ids.size() > 0) {
			employeeMapper.deleteEmployeesByIds(ids);
		}
	}

	@Override
	public Map<String, Object> getEmployeesByConditions(EmployeeQuery query) {

		List<EmployeeQuery> employees = employeeMapper
				.getEmployeesByConditions(query);
		Integer count = employeeMapper.getEmployeesCountByConditions(query);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("count", count);
		map.put("rows", employees);
		return map;
	}
}
