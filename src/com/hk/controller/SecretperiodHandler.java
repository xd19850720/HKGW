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
import com.hk.bean.Secretperiod;
import com.hk.service.EmployeeService;
import com.hk.service.SecretperiodService;

@Controller
@RequestMapping("/secretperiod")
public class SecretperiodHandler {

	@Autowired
	@Qualifier("secretperiodService")
	private SecretperiodService secretperiodService;

	@RequestMapping("/getAllSecretperiod")
	public @ResponseBody
	List<Secretperiod> getAllSecretperiod() {
		return secretperiodService.getAll();
	}
}
