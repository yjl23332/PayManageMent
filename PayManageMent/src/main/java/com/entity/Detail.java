package com.entity;
/**
 * 水电话费缴费详情
 * @author Lenovo
 *
 */
public class Detail {
	private int id;
	private int weType;//1-表示水费 2-表示电费 3-表示话费
	private Users users;//用户 id
	private String weId;//水电id
	private String time;//缴费时间
	private double money;//缴费金额
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeType() {
		return weType;
	}
	public void setWeType(int weType) {
		this.weType = weType;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getWeId() {
		return weId;
	}
	public void setWeId(String weId) {
		this.weId = weId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
