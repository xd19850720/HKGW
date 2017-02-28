package com.hk.mapper;

import java.util.List;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.PrivilegeQuery;
import com.hk.bean.RoleQuery;

public interface RoleMapper {

	public List<RoleQuery> getAllRoles(RoleQuery query);

	public int getRolesCount();

	public void addRole(RoleQuery query);

	public void modifyRole(RoleQuery query);

	public void deleteRoles(List<Integer> ids);

	// public int getRolesCountByEmployeeId(Integer employeeId);
	public RoleQuery getRoleByEmployeeId(Integer employeeId);

	public List<RoleQuery> getRolesUnSelectedByEmployeeId(Integer employeeId);

	public int getRolesCountUnSelectedByEmployeeId(Integer employeeId);

	// 更新员工的角色
	public void modifyEmployeeRole(EmployeeQuery query);

	// 查找和角色关联的权限
	public List<PrivilegeQuery> getResourcePrivilegeRelate(Integer roleId);

	public Integer getResourcePrivilegeRelateCount(Integer roleId);

	public void deleteRolePrivilegeRelate(RoleQuery query);

	public List<PrivilegeQuery> getPrivilegeUnRelated(RoleQuery query);

	public int getPrivilegeCountUnRelated(RoleQuery query);

	public void addPrivilegeRoleRelate(RoleQuery query);

}