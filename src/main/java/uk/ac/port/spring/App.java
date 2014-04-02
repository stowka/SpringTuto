package uk.ac.port.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("uk/ac/port/spring/beans/beans.xml");
		Person p = (Person)context.getBean("person");
	
		System.out.println(p);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}