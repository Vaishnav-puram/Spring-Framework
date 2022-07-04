package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	   public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	       ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/configCollections.xml");
	       Employee Emp1=(Employee)context.getBean("Emp1");
	       System.out.println(Emp1);
	    }
}
