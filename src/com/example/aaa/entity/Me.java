package com.example.aaa.entity;

import java.io.Serializable;

public class Me implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String date;//
	public String count;//当前访问总数
	public String laji;//好评总数
	public String guanli;//中评总数
	public String benti;//差评总数
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getLaji() {
		return laji;
	}
	public void setLaji(String laji) {
		this.laji = laji;
	}
	public String getGuanli() {
		return guanli;
	}
	public void setGuanli(String guanli) {
		this.guanli = guanli;
	}
	public String getBenti() {
		return benti;
	}
	public void setBenti(String benti) {
		this.benti = benti;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
