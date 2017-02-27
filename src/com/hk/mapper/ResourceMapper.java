package com.hk.mapper;

import java.util.List;

import com.hk.bean.PrivilegeQuery;
import com.hk.bean.ResourceQuery;

public interface ResourceMapper {
	public List<ResourceQuery> getAllResources(ResourceQuery query);

	public int getResourcesCount();

	public void addResource(ResourceQuery query);

	public void modifyResource(ResourceQuery query);

	public void deleteResources(List<Integer> ids);

	public PrivilegeQuery getPrivilegeByResourceId(Integer resourceId);

	public List<PrivilegeQuery> getUnSelectedPrivilegeByResourceId(
			ResourceQuery query);

	public Integer getUnSelectedPrivilegeCountByResourceId(ResourceQuery query);

	public void modifyResourcePrivilege(ResourceQuery query);
}