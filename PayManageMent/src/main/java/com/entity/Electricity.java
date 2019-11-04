package com.entity;
/**
 * 电表
 * @author Lenovo
 *
 */
public class Electricity {
	private  String eId;
	private Users users;
	private String eTime;//开户时间
	private int type;//状态 1-正常 0-停用
	private int count ;//本月所用度
	private int beforeCount;//上月所用度
	public String  geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String geteTime() {
		return eTime;
	}
	public void seteTime(String eTime) {
		this.eTime = eTime;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBeforeCount() {
		return beforeCount;
	}
	public void setBeforeCount(int beforeCount) {
		this.beforeCount = beforeCount;
	}
	
}
