package com.springcore.autoWiring1.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2") //as we have given two beans in config file,but this class accepts only one bean so @qualifier checks with the name we given in its parameter
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
