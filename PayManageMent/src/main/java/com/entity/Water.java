package com.entity;
/**
 * 水表
 * @author Lenovo
 *
 */
public class Water {
	private String wId;//水表id
	private Users users; //需要userid
	private String wTime;//开户时间
	private int Type;//水表状态 1-正常 0-停用
	private int count ;//本月所用（吨）
	private int beforeCount;//上月所用（吨）
	public String getwId() {
		return wId;
	}
	public void setwId(String wId) {
		this.wId = wId;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getwTime() {
		return wTime;
	}
	public void setwTime(String wTime) {
		this.wTime = wTime;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
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
