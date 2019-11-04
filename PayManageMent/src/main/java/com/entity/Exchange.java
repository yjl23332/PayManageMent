package com.entity;
/**
 * 兑换商品表
 * @author Lenovo
 *
 */
public class Exchange {
	private int ecId;
	private String ecName;//商品名称
	private String image;//图片
	private int ecIntegration;//所需积分
	private int rumaining;//库存
	
	public int getEcId() {
		return ecId;
	}
	public void setEcId(int ecId) {
		this.ecId = ecId;
	}
	public String getEcName() {
		return ecName;
	}
	public void setEcName(String ecName) {
		this.ecName = ecName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getEcIntegration() {
		return ecIntegration;
	}
	public void setEcIntegration(int ecIntegration) {
		this.ecIntegration = ecIntegration;
	}
	public int getRumaining() {
		return rumaining;
	}
	public void setRumaining(int rumaining) {
		this.rumaining = rumaining;
	}
}
