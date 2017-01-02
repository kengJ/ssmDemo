package com.model;

public class User {

	private Integer UserId;
	private String UserName;
	private String UserPassword;
	private String UserEmail;
	private String UserNickName;
	private String UserAddress;
	private String UserPhone;
	private String UserRemark;
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
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserNickName() {
		return UserNickName;
	}
	public void setUserNickName(String userNickName) {
		UserNickName = userNickName;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public String getUserRemark() {
		return UserRemark;
	}
	public void setUserRemark(String userRemark) {
		UserRemark = userRemark;
	}
	public Integer getSexId() {
		return SexId;
	}
	public void setSexId(Integer sexId) {
		SexId = sexId;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserPassword=" + UserPassword + ", UserEmail="
				+ UserEmail + ", UserNickName=" + UserNickName + ", UserAddress=" + UserAddress + ", UserPhone="
				+ UserPhone + ", UserRemark=" + UserRemark + ", SexId=" + SexId + "]";
	}
	
}
