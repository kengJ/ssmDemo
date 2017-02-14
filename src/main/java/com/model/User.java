package com.model;

public class User {

	private Integer UserId;
	private String UserName;
	private String UserPassword;
	private Integer SexId;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public Integer getSexId() {
		return SexId;
	}
	public void setSexId(Integer sexId) {
		SexId = sexId;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserPassword=" + UserPassword + ", SexId="
				+ SexId + "]";
	}
}
