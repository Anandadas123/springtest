package com.livingoncodes.spring.test.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/livingoncodes/spring/test/springtest/beans/beans.xml");
    	Patient patient= (Patient) context.getBean("patient");
    	Patient patient2= (Patient) context.getBean("patient");
    	Address address2= (Address) context.getBean("address2");
//    	patient1.speak();
    	patient2.setName("mo");
    	if(patient.equals(patient2)) {
    		System.out.println("equal");
    	}else {
    		System.out.println("not equal");

    	}
    	System.out.println(patient);
    	System.out.println(patient2);
    	System.out.println(address2);
    	((ClassPathXmlApplicationContext) context).close();
    }
}
