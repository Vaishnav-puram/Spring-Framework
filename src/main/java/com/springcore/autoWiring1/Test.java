package com.springcore.autoWiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autoWiring1/configautoWiring1.xml");
		Emp e1=(Emp)context.getBean("emp1");
		Emp e2=context.getBean("emp1",Emp.class);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.getAddress());
	}

}
