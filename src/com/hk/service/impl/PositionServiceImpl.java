package com.hk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.PositionQuery;
import com.hk.mapper.PositionMapper;
import com.hk.service.PositionService;

public class PositionServiceImpl implements PositionService {

	@Autowired
	@Qualifier("positionMapper")
	private PositionMapper positionMapper;

	@Override
	public void add(PositionQuery query) {
		positionMapper.insertSelective(query);
	}

	@Override
	public List<PositionQuery> getAllPositions() {

		List<PositionQuery> positions = positionMapper.getAllPositions();
		for (PositionQuery positionQuery : positions) {
			positionQuery.setId(positionQuery.getPositionid());
			positionQuery.setText(positionQuery.getPositionname());
			positionQuery.setSelected(false);
		}
		return positions;
	}
}
