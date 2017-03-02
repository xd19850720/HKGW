package com.hk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Secretperiod;
import com.hk.mapper.EmployeeMapper;
import com.hk.mapper.SecretperiodMapper;
import com.hk.service.EmployeeService;
import com.hk.service.SecretperiodService;
import com.hk.util.Util;

public class SecretperiodServiceImpl implements SecretperiodService {

	@Autowired
	@Qualifier("secretperiodMapper")
	private SecretperiodMapper secretperiodMapper;

	


	@Override
	public List<Secretperiod> getAll() {
		List<Secretperiod> secretperiods = (List<Secretperiod>) secretperiodMapper.getAll();
		return secretperiods;
	}

}
