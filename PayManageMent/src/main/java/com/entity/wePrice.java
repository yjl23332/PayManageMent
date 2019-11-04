package com.entity;
/**
 * 水电价格
 */
public class wePrice {
	private int weId;
	private String weName; //水电名称
	private double price;//价格
	private String newTime;//更新时间
	
	public int getWeId() {
		return weId;
	}
	public void setWeId(int weId) {
		this.weId = weId;
	}
	public String getWeName() {
		return weName;
	}
	public void setWeName(String weName) {
		this.weName = weName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNewTime() {
		return newTime;
	}
	public void setNewTime(String newTime) {
		this.newTime = newTime;
	}
}
