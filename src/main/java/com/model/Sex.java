package com.model;

import java.io.Serializable;

public class Sex implements Serializable{

	private static final long serialVersionUID = -6388409903697797504L;
	private Integer SexId;
	private String SexType;
	public Integer getSexId() {
		return SexId;
	}
	public void setSexId(Integer sexId) {
		SexId = sexId;
	}
	public String getSexType() {
		return SexType;
	}
	public void setSexType(String sexType) {
		SexType = sexType;
	}
	@Override
	public String toString() {
		return "Sex [SexId=" + SexId + ", SexType=" + SexType + "]";
	}
	
}
