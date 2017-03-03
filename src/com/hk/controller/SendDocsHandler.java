package com.hk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Mainsupplydep;
import com.hk.bean.Senddocs;
import com.hk.service.EmployeeService;
import com.hk.service.MainsupplydepService;
import com.hk.service.SendDocsService;
import com.hk.util.GetDepartBeanHelper;

@Controller
@RequestMapping("/sendDocs")
public class SendDocsHandler {

	@Autowired
	@Qualifier("sendDocsService")
	private SendDocsService sendDocsService;
	@Autowired
	@Qualifier("mainsupplydepService")
	private MainsupplydepService mainsupplydepService;

	@RequestMapping("/getAllDocs")
	public @ResponseBody
	Map<String, Object> getAllDocs() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", sendDocsService.getAllDocs());
		map.put("total", sendDocsService.getAllDocs().size());
		return map;
	}
	@RequestMapping("/add")
	@ResponseBody
	public Map<String, Object> add(HttpServletRequest request,Senddocs senddocs){
		//插入主表数据
		sendDocsService.add(senddocs);
		
		//插入主送部门数据
		List<Mainsupplydep>  mainsupplydeps = GetDepartBeanHelper.getMainSupplyDepBean(senddocs);
		
		for (int i = 0; i < mainsupplydeps.size(); i++) {
			mainsupplydepService.add(mainsupplydeps.get(i));
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", senddocs.getId());
		return map;
	}

	@RequestMapping("/deletedoc")
	@ResponseBody
	public Map<String, Object> delete(Integer id){
		//插入主表数据
		sendDocsService.delete(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flag", "删除成功");
		return map;
	}
	
	@RequestMapping("/updatestatusbyid")
	@ResponseBody
	public Map<String, Object> updatestatusById(Integer id,String status){
		//插入主表数据
		sendDocsService.updatestatusById(id, status);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flag", "更新成功");
		return map;
	}


}
