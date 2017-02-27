package com.hk.service;

import java.util.List;
import java.util.Map;

import com.hk.bean.PrivilegeQuery;
import com.hk.bean.ResourceQuery;
import com.hk.bean.RoleQuery;

public interface SecurityService {
	// 1.列出所有的权限
	public Map<String, Object> getAllPrivileges(PrivilegeQuery query);

	// 2.增加权限
	public void addPrivilege(PrivilegeQuery query);

	// 3.修改权限

	public void modifyPrivilege(PrivilegeQuery query);

	// 4.删除权限

	public void deletePrivilege(List<Integer> ids);

	// 5.列出所有的角色
	public Map<String, Object> getAllRole(RoleQuery query);

	// 6.增加角色
	public void addRole(RoleQuery query);

	// 7.删除角色
	public void deleteRole(List<Integer> ids);

	// 8.修改角色
	public void modifyRole(RoleQuery query);

	// 9.列出所有的资源
	public Map<String, Object> getAllResource(ResourceQuery query);

	// 10.新增新的资源

	public void addResource(ResourceQuery query);

	// 11.修改资源
	public void modifyResource(ResourceQuery query);

	// 12.删除资源

	public void deleteResource(List<Integer> ids);

	// 根据员工的ID查找所属角色
	public Map<String, Object> getRolesByEmployeeId(Integer employeeId);

	// 根据员工ID查找用户没有选择的角色
	public Map<String, Object> getRolesUnSelectedByEmployeeId(Integer employeeId);

	// 更新员工的角色

	public void modifyEmployeeRole(Integer emplpoyeeId, Integer roleId);

	// 查找资源对应的权限
	public Map<String, Object> getPrivilegeByResourceId(Integer resourceId);

	// 查找资源可以选择的权限
	public Map<String, Object> getUnSelectedPrivilegeByResourceId(
			ResourceQuery query);

	// 修改资源的权限
	public void modifyResourcePrivilege(Integer resourceId, Integer privilegeId);
}
