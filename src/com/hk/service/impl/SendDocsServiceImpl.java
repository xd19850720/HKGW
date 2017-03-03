package com.hk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Senddocs;
import com.hk.mapper.EmployeeMapper;
import com.hk.mapper.SenddocsMapper;
import com.hk.service.EmployeeService;
import com.hk.service.SendDocsService;
import com.hk.util.Util;

public class SendDocsServiceImpl implements SendDocsService {

	@Autowired
	@Qualifier("senddocsMapper")
	private SenddocsMapper senddocsMapper;

	@Override
	public List<Senddocs> getAllDocs() {
		List<Senddocs> docs = senddocsMapper.selectAll();
		return docs;
	}

	@Override
	public void add(Senddocs docs) {
		senddocsMapper.insert(docs);
	}

	@Override
	public void delete(Integer id) {
		senddocsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updatestatusById(Integer id, String status) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id+"");
		map.put("status", status);
		senddocsMapper.updatestatusById(map);
	}

	
}
