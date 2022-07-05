package com.springcore.constructors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	   public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	       ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructors/configAmbiguity.xml");
	       Addition addition1=(Addition)context.getBean("addition");
	       addition1.sum();
	       
	    }
}

