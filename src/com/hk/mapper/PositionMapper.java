package com.hk.mapper;

import java.util.List;

import com.hk.bean.Position;
import com.hk.bean.PositionQuery;

public interface PositionMapper {

	int insert(Position record);

	int insertSelective(Position record);

	public List<PositionQuery> getAllPositions();
}