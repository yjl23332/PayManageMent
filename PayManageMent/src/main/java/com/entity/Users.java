package com.entity;
/**
 * 用户表
 * @author Lenovo
 *
 */
public class Users {
	private int userId;
	private String LoginName; //登录姓名
	private String pwd;//密码
	private String name;//真实姓名
	private String phone;//手机号
	private String address;//地址
	private int userType;//用户状态 1-正常，0-注销
	private int Integration;//积分
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getIntegration() {
		return Integration;
	}
	public void setIntegration(int integration) {
		Integration = integration;
	}
}
