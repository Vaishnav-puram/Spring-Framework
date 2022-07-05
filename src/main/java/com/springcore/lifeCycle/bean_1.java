package com.springcore.lifeCycle;
public class bean_1 {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price.......");
		this.price = price;
	}

	public bean_1(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "bean_1 [price=" + price + "]";
	}

	public bean_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init() {
		System.out.println("inside init method.......");
	}
	public void destroy() {
		System.out.println("inside destroy method..........");
	}
}
