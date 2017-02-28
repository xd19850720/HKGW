package com.hk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.Senddocs;
import com.hk.service.EmployeeService;
import com.hk.service.SendDocsService;

@Controller
@RequestMapping("/sendDocs")
public class SendDocsHandler {

	@Autowired
	@Qualifier("sendDocsService")
	private SendDocsService sendDocsService;

	@RequestMapping("/getAllDocs")
	public @ResponseBody
	Map<String, Object> getAllDocs() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", sendDocsService.getAllDocs());
		map.put("total", sendDocsService.getAllDocs().size());
		return map;
	}

}
