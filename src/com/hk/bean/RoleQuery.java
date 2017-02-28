package com.hk.bean;

import java.util.List;

public class RoleQuery extends TRole {
	private Integer startIndex;
	private Integer rows;
	private Integer page;

	private Integer privilegeIdRelated;

	private List<Integer> privilegeIds;

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<Integer> getPrivilegeIds() {
		return privilegeIds;
	}

	public void setPrivilegeIds(List<Integer> privilegeIds) {
		this.privilegeIds = privilegeIds;
	}

	public Integer getPrivilegeIdRelated() {
		return privilegeIdRelated;
	}

	public void setPrivilegeIdRelated(Integer privilegeIdRelated) {
		this.privilegeIdRelated = privilegeIdRelated;
	}

}
