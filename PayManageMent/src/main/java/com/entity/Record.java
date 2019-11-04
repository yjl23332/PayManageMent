package com.entity;
/**
 * 兑换商品缴费详细
 * @author Lenovo
 *
 */
public class Record {
	private int rId;//商城详情编号
	private Users users;//用户对象 -Id
	private String rTime;//兑换时间
	private Exchange exchange;//兑换商品id
	private String context;//备注
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getrTime() {
		return rTime;
	}
	public void setrTime(String rTime) {
		this.rTime = rTime;
	}
	public Exchange getExchange() {
		return exchange;
	}
	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	
}
