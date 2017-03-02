package com.hk.service;

import java.util.List;
import java.util.Map;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Senddocs;

public interface SendDocsService {

	public List<Senddocs> getAllDocs();
	public void add(Senddocs docs);
	public void delete(Integer id);

}
