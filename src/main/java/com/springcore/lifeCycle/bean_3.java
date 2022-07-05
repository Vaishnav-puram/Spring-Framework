package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class bean_3 {
	private String name;

	@Override
	public String toString() {
		return "bean_3 [name=" + name + "]";
	}

	public bean_3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct //comes with adding javax annotation dependency in pom.xml
	public void init() {
		System.out.println("inside init method.....");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method........");
	}
}
