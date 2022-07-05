package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String args[]) {
			//to use registerShutdownHook we use AbstractAplicationContext
			AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifeCycle/configLifeCycle.xml");
			//to call destroy method
			context.registerShutdownHook();
			bean_1 b1=(bean_1)context.getBean("b1");
			System.out.println("implementing lifecycle of beans using xml");
			System.out.println(b1);
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("implementing lifecycle of beans using interfaces");
			bean_2 b2=(bean_2)context.getBean("b2");
			System.out.println(b2);
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("implementing lifecycle of beans using annotations");
			bean_3 b3=(bean_3)context.getBean("b3");
			System.out.println(b3);
		}

}
