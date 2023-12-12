package com.zettamine.caseStudies.day01;

public class Items {
	private String item;
	private int discount;
	
	public Items(String item,int discount) {
		super();
		this.item = item;
		this.discount = discount;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Items [item=" + item + ", discount=" + discount + "]";
	}
	
	
}
