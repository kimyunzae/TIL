package com.vo;

import java.util.Date;

public class ItemVO {
	private int id;
	private String name;
	private int price;
	private String imgname;
	private Date regdate;
	
	public ItemVO() {
	}

	public ItemVO(int id, String name, int price, String imgname, Date regdate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
		this.regdate = regdate;
	}

	public ItemVO(String name, int price, String imgname) {
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}

	@Override
	public String toString() {
		return "ItemVO [id=" + id + ", name=" + name + ", price=" + price + ", imgname=" + imgname + ", regdate="
				+ regdate + "]";
	}
	
	
	
	
	
	
	
}
