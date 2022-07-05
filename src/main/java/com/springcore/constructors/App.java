package com.springcore.constructors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	   public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	       ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructors/configConstructor.xml");
	       Person person1=(Person)context.getBean("person");
	       System.out.println(person1);
	       
	    }
}

