package com.entity;
/**
 * 实时通告
 * @author Lenovo
 *
 */
public class Notice {
	private int nId;//通告id
	private String nTitle;//标题
	private String nTime;//更新时间
	private String nContext;//内容
	
	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
		this.nId = nId;
	}
	public String getnTitle() {
		return nTitle;
	}
	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}
	public String getnTime() {
		return nTime;
	}
	public void setnTime(String nTime) {
		this.nTime = nTime;
	}
	public String getnContext() {
		return nContext;
	}
	public void setnContext(String nContext) {
		this.nContext = nContext;
	}
	
}
