package com.hk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Mainsupplydep;
import com.hk.mapper.EmployeeMapper;
import com.hk.mapper.MainbodyMapper;
import com.hk.mapper.MainsupplydepMapper;
import com.hk.service.EmployeeService;
import com.hk.service.MainsupplydepService;
import com.hk.util.Util;

public class MainsupplydepServiceImpl implements MainsupplydepService {

	@Autowired
	@Qualifier("mainsupplydepMapper")
	private MainsupplydepMapper mainsupplydepMapper;

	@Override
	public void add(Mainsupplydep mainsupplydep) {
		// 插入数据
		mainsupplydepMapper.insert(mainsupplydep);
	}

}
