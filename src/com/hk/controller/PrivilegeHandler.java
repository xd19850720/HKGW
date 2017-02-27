package com.hk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.PrivilegeQuery;
import com.hk.bean.ResourceQuery;
import com.hk.bean.RoleQuery;
import com.hk.service.SecurityService;

@Controller
@RequestMapping("/privilege")
public class PrivilegeHandler {

	@Autowired
	@Qualifier("securityService")
	private SecurityService securityService;

	@RequestMapping("/getAllPrivilegeByPage")
	public @ResponseBody
	Map<String, Object> getAllPrivilege(PrivilegeQuery query) {
		return securityService.getAllPrivileges(query);
	}

	@RequestMapping("/addPrivilege")
	public @ResponseBody
	String addPrivilege(PrivilegeQuery query) {
		securityService.addPrivilege(query);
		return "success";
	}

	@RequestMapping("/deletePrivilege")
	public void deletePrivilege(String ids) {
		String[] idArray = ids.split(",");
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : idArray) {
			idList.add(Integer.parseInt(id));
		}
		securityService.deletePrivilege(idList);
	}

	@RequestMapping("/modifyPrivilege")
	public @ResponseBody
	String modifyPrivilege(PrivilegeQuery query) {
		securityService.modifyPrivilege(query);
		return "更新成功";
	}

	@RequestMapping("/getAllresourcesByPage")
	public @ResponseBody
	Map<String, Object> getAllResources(ResourceQuery resourceQuery) {
		return securityService.getAllResource(resourceQuery);
	}

	@RequestMapping("/addResource")
	public @ResponseBody
	String addResource(ResourceQuery query) {
		securityService.addResource(query);
		return "添加成功";
	}

	@RequestMapping("/modifyResource")
	public @ResponseBody
	String modifyResource(ResourceQuery query) {
		securityService.modifyResource(query);
		return "更新成功";
	}

	@RequestMapping("/deleteResources")
	public @ResponseBody
	String deleteResources(String ids) {
		String[] idArray = ids.split(",");
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : idArray) {
			idList.add(Integer.parseInt(id));
		}
		securityService.deleteResource(idList);
		return "删除成功";
	}

	// 角色
	@RequestMapping("/getAllRolesByPage")
	public @ResponseBody
	Map<String, Object> getAllRoles(RoleQuery query) {
		return securityService.getAllRole(query);
	}

	@RequestMapping("/addRole")
	public @ResponseBody
	String addRole(RoleQuery query) {
		securityService.addRole(query);
		return "添加成功";
	}

	@RequestMapping("/modifyRole")
	public @ResponseBody
	String modifyRole(RoleQuery query) {
		securityService.modifyRole(query);
		return "更新成功";
	}

	@RequestMapping("/deleteRoles")
	public @ResponseBody
	String deleteRoles(String ids) {
		String[] idArray = ids.split(",");
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : idArray) {
			idList.add(Integer.parseInt(id));
		}
		securityService.deleteRole(idList);
		return "删除成功";
	}

	// 权限业务逻辑
	@RequestMapping("/getRolesByEmployeeId")
	public @ResponseBody
	Map<String, Object> getRolesByEmployeeId(Integer employeeId) {
		return securityService.getRolesByEmployeeId(employeeId);
	}

	@RequestMapping("/getRolesUnSelectedByEmployeeId")
	public @ResponseBody
	Map<String, Object> getRolesUnSelectedByEmployeeId(Integer employeeId) {
		return securityService.getRolesUnSelectedByEmployeeId(employeeId);
	}

	// 更改员工的角色
	@RequestMapping("/modifyEmployeeRole")
	public @ResponseBody
	String modifyEmployeeRole(Integer employeeId, Integer roleId) {
		securityService.modifyEmployeeRole(employeeId, roleId);
		return "更改成功";
	}

	// 查询资源的权限
	@RequestMapping("/getPrivilegeByResourceId")
	public @ResponseBody
	Map<String, Object> getPrivilegeByResourceId(Integer resourceId) {

		return securityService.getPrivilegeByResourceId(resourceId);

	}

	// 查询资源可以选择的权限
	@RequestMapping("/getUnSelectedPrivilegeByResourceId")
	public @ResponseBody
	Map<String, Object> getUnSelectedPrivilegeByResourceId(ResourceQuery query) {
		return securityService.getUnSelectedPrivilegeByResourceId(query);
	}

	// 更改资源的权限
	@RequestMapping("/modifyResourcePrivilege")
	public @ResponseBody
	String modifyResourcePrivilege(Integer resourceId, Integer privilegeId) {
		securityService.modifyResourcePrivilege(resourceId, privilegeId);
		return "更新成功";
	}

}
