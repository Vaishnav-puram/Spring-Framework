package com.springcore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class bean_2 implements InitializingBean,DisposableBean { //interfaces to implement lifecycle of beans
	private double price;

	public bean_2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "bean_2 [price=" + price + "]";
	}
	
	/// implementing lifecycle of bean using interfaces 
	public void afterPropertiesSet() throws Exception { //works as init method
		// TODO Auto-generated method stub
		System.out.println("doing some work......");
		System.out.println("inside init method.....");
		
	}

	public void destroy() throws Exception { //works as destroy method
		// TODO Auto-generated method stub
		System.out.println("completed the work.......");
		System.out.println("inside destroy method.....");
		
	}
}
