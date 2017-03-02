package com.hk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Secretlevel;
import com.hk.bean.Secretperiod;
import com.hk.mapper.EmployeeMapper;
import com.hk.mapper.SecretlevelMapper;
import com.hk.mapper.SecretperiodMapper;
import com.hk.service.EmployeeService;
import com.hk.service.SecretlevelService;
import com.hk.service.SecretperiodService;
import com.hk.util.Util;

public class SecretlevelServiceImpl implements SecretlevelService {

	@Autowired
	@Qualifier("secretlevelMapper")
	private SecretlevelMapper secretlevelMapper;

	@Override
	public List<Secretlevel> getAll() {
		List<Secretlevel> secretlevels = (List<Secretlevel>) secretlevelMapper.getAll();
		return secretlevels;
	}

}
