package com.hlg.entity;

public class WorkType {

	public WorkType() {
		super();
	}

	public WorkType(String typeName) {
		super();
		this.typeName = typeName;
	}

	public WorkType(int id, String typeName) {
		super();
		this.id = id;
		this.typeName = typeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	private int id;
	private String typeName;
}
