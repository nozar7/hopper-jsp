package com.web.hopper.model;

public class Venta {
	
	String name;
	String itemName;
	Double price;
	String description;
	String seller;
	
	public Venta() {
		super();
	}
	public Venta(String name, String itemName, Double price, String description, String seller) {
		super();
		this.name = name;
		this.itemName = itemName;
		this.price = price;
		this.description = description;
		this.seller = seller;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}

}
