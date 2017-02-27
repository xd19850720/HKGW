package com.hk.service;

import java.util.List;

import com.hk.bean.PositionQuery;

public interface PositionService {

	public void add(PositionQuery query);

	public List<PositionQuery> getAllPositions();

}
