package com.entity;
/**
 * 话费
 * @author Lenovo
 *
 */
public class Phone {
	private int phoneId;
	private String phone;
	private double phonePrice;//话费余额
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getPhonePrice() {
		return phonePrice;
	}
	public void setPhonePrice(double phonePrice) {
		this.phonePrice = phonePrice;
	}
	
}
