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

import com.hk.bean.Department;
import com.hk.bean.Employee;
import com.hk.bean.EmployeeQuery;
import com.hk.bean.Secretlevel;
import com.hk.bean.Secretperiod;
import com.hk.service.DepartmentService;
import com.hk.service.EmployeeService;
import com.hk.service.SecretlevelService;
import com.hk.service.SecretperiodService;

@Controller
@RequestMapping("/department")
public class DepartmentHandler {

	@Autowired
	@Qualifier("departmentService")
	private DepartmentService departmentService;

	@RequestMapping("/getAlldDepartment")
	public @ResponseBody
	List<Department> getAllDepartments() {
		return departmentService.getAll();
	}
}
