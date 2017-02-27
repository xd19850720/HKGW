package com.hk.bean;

public class ResourceQuery extends TResource {
	private Integer startIndex;
	private Integer rows;
	private Integer page;

	private String privilegeName;

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

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

}
