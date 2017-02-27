package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.PositionQuery;
import com.hk.service.PositionService;

@Controller
@RequestMapping("position")
public class PositionHandler {
	@Autowired
	@Qualifier("positionService")
	private PositionService positionService;

	@RequestMapping("/getAllPositions")
	public @ResponseBody
	List<PositionQuery> getAllPositions() {
		return positionService.getAllPositions();
	}
}
