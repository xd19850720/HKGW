package com.hk.mapper;

import java.util.List;

import com.hk.bean.PrivilegeQuery;

public interface PrivilegeMapper {
	public void addPrivilege(PrivilegeQuery query);

	public List<PrivilegeQuery> getAllPrivilegas(PrivilegeQuery query);

	public void mofifyPrivilege(PrivilegeQuery query);

	public void deletePrivilege(List<Integer> list);

	public int getAllPrivilegaCount();
}