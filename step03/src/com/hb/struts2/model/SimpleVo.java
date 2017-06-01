package com.hb.struts2.model;

import java.sql.Date;

public class SimpleVo {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;	
	
	public SimpleVo(int sabun, String name, Date nalja, int pay) {
		super();
		System.out.println("voΩ√¿€");
		this.sabun = sabun;
		this.name = name;
		this.nalja = nalja;
		this.pay = pay;
		System.out.println("vo≥°");
	}

	public int getSabun() {
		System.out.println("getSabun");
		return sabun;
	}

	public void setSabun(int sabun) {
		System.out.println("setSabun");
		this.sabun = sabun;
		
	}

	public String getName() {
		System.out.println("getName");
		return name;
	}

	public void setName(String name) {	
		System.out.println("setName");
		this.name = name;
	}

	public Date getNalja() {
		System.out.println("getNalja");
		return nalja;
	}

	public void setNalja(Date nalja) {
		System.out.println("setNalja");
		this.nalja = nalja;
	}

	public int getPay() {
		System.out.println("getPay");
		return pay;
	}

	public void setPay(int pay) {
		System.out.println("setPay");
		this.pay = pay;
	}

	@Override
	public String toString() {
		System.out.println("toString");
		return "SimpleVo [sabun=" + sabun + ", name=" + name + ", nalja=" + nalja + ", pay=" + pay + "]";
	}
	
}
