package com.hk.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hk.bean.EmployeeQuery;
import com.hk.bean.PrivilegeQuery;
import com.hk.bean.ResourceQuery;
import com.hk.bean.RoleQuery;
import com.hk.mapper.PrivilegeMapper;
import com.hk.mapper.ResourceMapper;
import com.hk.mapper.RoleMapper;
import com.hk.service.SecurityService;

public class SecurityServiceImpl implements SecurityService {

	@Autowired
	@Qualifier("privilegeMapper")
	private PrivilegeMapper privilegeMapper;
	@Autowired
	@Qualifier("resourceMapper")
	private ResourceMapper resourceMapper;
	@Autowired
	@Qualifier("roleMapper")
	private RoleMapper roleMapper;

	@Override
	public void addPrivilege(PrivilegeQuery query) {
		privilegeMapper.addPrivilege(query);
	}

	@Override
	public Map<String, Object> getAllPrivileges(PrivilegeQuery query) {

		query.setStartIndex((query.getRows() * (query.getPage() - 1)));
		List<PrivilegeQuery> queries = privilegeMapper.getAllPrivilegas(query);
		Integer count = privilegeMapper.getAllPrivilegaCount();
		Map<String, Object> datas = new HashMap<String, Object>();
		datas.put("total", count);
		datas.put("rows", queries);
		return datas;
	}

	@Override
	public void modifyPrivilege(PrivilegeQuery query) {
		privilegeMapper.mofifyPrivilege(query);
	}

	@Override
	public void deletePrivilege(List<Integer> ids) {
		privilegeMapper.deletePrivilege(ids);
	}

	@Override
	public Map<String, Object> getAllResource(ResourceQuery query) {
		query.setStartIndex((query.getRows() * (query.getPage() - 1)));
		List<ResourceQuery> resources = resourceMapper.getAllResources(query);
		Map<String, Object> map = new HashMap<String, Object>();
		Integer count = resourceMapper.getResourcesCount();
		map.put("rows", resources);
		map.put("total", count);
		return map;
	}

	@Override
	public void addResource(ResourceQuery query) {
		resourceMapper.addResource(query);
	}

	@Override
	public void deleteResource(List<Integer> ids) {
		resourceMapper.deleteResources(ids);
	}

	@Override
	public void modifyResource(ResourceQuery query) {
		resourceMapper.modifyResource(query);
	}

	@Override
	public Map<String, Object> getAllRole(RoleQuery query) {
		query.setStartIndex((query.getRows() * (query.getPage() - 1)));
		List<RoleQuery> roles = roleMapper.getAllRoles(query);
		Map<String, Object> map = new HashMap<String, Object>();
		Integer count = roleMapper.getRolesCount();
		map.put("rows", roles);
		map.put("total", count);
		return map;
	}

	@Override
	public void addRole(RoleQuery query) {
		roleMapper.addRole(query);
	}

	@Override
	public void deleteRole(List<Integer> ids) {
		roleMapper.deleteRoles(ids);
	}

	@Override
	public void modifyRole(RoleQuery query) {
		roleMapper.modifyRole(query);
	}

	@Override
	public Map<String, Object> getRolesByEmployeeId(Integer employeeId) {
		RoleQuery roleQuery = roleMapper.getRoleByEmployeeId(employeeId);
		List<RoleQuery> roles = new ArrayList<RoleQuery>();
		roles.add(roleQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", 1);
		map.put("rows", roles);
		return map;
	}

	@Override
	public Map<String, Object> getRolesUnSelectedByEmployeeId(Integer employeeId) {
		List<RoleQuery> roles = roleMapper
				.getRolesUnSelectedByEmployeeId(employeeId);
		Integer count = roleMapper
				.getRolesCountUnSelectedByEmployeeId(employeeId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", roles);
		map.put("total", count);
		return map;
	}

	@Override
	public void modifyEmployeeRole(Integer emplpoyeeId, Integer roleId) {
		EmployeeQuery employeeQuery = new EmployeeQuery();
		employeeQuery.setRoleid(roleId);
		employeeQuery.setEmployeeid(emplpoyeeId);
		roleMapper.modifyEmployeeRole(employeeQuery);
	}

	@Override
	public Map<String, Object> getPrivilegeByResourceId(Integer resourceId) {
		Map<String, Object> map = new HashMap<String, Object>();
		PrivilegeQuery privilege = resourceMapper
				.getPrivilegeByResourceId(resourceId);
		List<PrivilegeQuery> privileges = new ArrayList<PrivilegeQuery>();
		privileges.add(privilege);

		map.put("total", 1);
		map.put("rows", privileges);
		return map;
	}

	@Override
	public Map<String, Object> getUnSelectedPrivilegeByResourceId(
			ResourceQuery query) {
		query.setStartIndex((query.getPage() - 1) * query.getRows());
		Map<String, Object> map = new HashMap<String, Object>();
		List<PrivilegeQuery> privileges = resourceMapper
				.getUnSelectedPrivilegeByResourceId(query);
		Integer count = resourceMapper
				.getUnSelectedPrivilegeCountByResourceId(query);
		map.put("total", count);
		map.put("rows", privileges);
		return map;
	}

	@Override
	public void modifyResourcePrivilege(Integer resourceId, Integer privilegeId) {
		ResourceQuery query = new ResourceQuery();
		query.setPrivilegeId(privilegeId + "");
		query.setResourceid(resourceId);
		resourceMapper.modifyResourcePrivilege(query);
	}

	@Override
	public Map<String, Object> getRelatedPrivileges(Integer roleId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<PrivilegeQuery> privilegeQuery = roleMapper
				.getResourcePrivilegeRelate(roleId);
		map.put("rows", privilegeQuery);
		map.put("total", roleMapper.getResourcePrivilegeRelateCount(roleId));
		return map;
	}

	@Override
	public void deletePrivilegeRelate(RoleQuery query) {
		roleMapper.deleteRolePrivilegeRelate(query);
	}

	@Override
	public Map<String, Object> getPrivilegeUnRelated(RoleQuery query) {
		query.setStartIndex((query.getPage() - 1) * query.getRows());
		List<PrivilegeQuery> privilegeQuery = roleMapper
				.getPrivilegeUnRelated(query);
		Integer count = roleMapper.getPrivilegeCountUnRelated(query);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", count);
		map.put("rows", privilegeQuery);
		return map;
	}

	@Override
	public void addPrivilegeIdRelated(Integer roleId, List<Integer> privilegeIds) {
		for (Integer privilegeId : privilegeIds) {
			RoleQuery query = new RoleQuery();
			query.setRoleid(roleId);
			query.setPrivilegeIdRelated(privilegeId);
			roleMapper.addPrivilegeRoleRelate(query);
		}
	}
}
