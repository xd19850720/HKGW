package com.hk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Employee;
import com.hk.bean.EmployeeQuery;
import com.hk.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeHandler {

	@Autowired
	@Qualifier("employeeService")
	private EmployeeService employeeService;

	@RequestMapping("/getAllEmployees")
	public @ResponseBody
	Map getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	// 分页查询用户
	@RequestMapping("/getEmployeesByPage")
	public @ResponseBody
	Map<String, Object> getEmployees(EmployeeQuery query) {
		return employeeService.getEmployees(query);
	}

	// 新增用户
	@RequestMapping("/addEmployee")
	public @ResponseBody
	String addEmployee(EmployeeQuery employeeQuery) {
		employeeService.add(employeeQuery);
		return "添加成功";
	}

	// 修改用户
	@RequestMapping("/editEmployee")
	public @ResponseBody
	String editEmployee(EmployeeQuery employeeQuery) {
		employeeService.editEmployee(employeeQuery);
		return "修改成功";
	}

	// 删除用户
	@RequestMapping("/deleteEmployees")
	public @ResponseBody
	String deleteEmployees(EmployeeQuery query) {

		String idString = query.getIds();
		String[] ids = idString.split(",");
		List<Integer> idIntegers = new ArrayList<Integer>();
		for (String id : ids) {
			idIntegers.add(Integer.parseInt(id));
		}
		employeeService.deleleEmployees(idIntegers);

		return "删除成功";
	}

	@RequestMapping("/getEmployeesByConditions")
	public @ResponseBody
	Map<String, Object> getEmployeesByConditions(EmployeeQuery query) {
		return employeeService.getEmployeesByConditions(query);
	}
	
	
	@RequestMapping("/getLoginUser")
	public @ResponseBody
	EmployeeQuery getLoginUser(HttpServletRequest request,HttpServletResponse response) {
		  HttpSession session = request.getSession();
		  EmployeeQuery employeeQuery = new EmployeeQuery();
		  employeeQuery.setEmployeename("张三丰");
		  session.setAttribute("user", employeeQuery);
		  return  employeeQuery;
	}
	
}
