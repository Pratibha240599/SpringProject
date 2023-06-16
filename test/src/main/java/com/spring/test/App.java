package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Student;
import testdao.TestDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/config.xml");
    	TestDao testdao  = context.getBean("testdao", TestDao.class);
    	
    	Student student = new Student();
    	/*student.setId(20);
    	student.setName("Sumita");
    	student.setAddress("Delhi");
    	
    	student.setId(20);
    	student.setName("suman");
    	student.setAddress("Noida");*/
    	
    	int result = testdao.delete(20);
    	System.out.println("Print result : " + result);
    	
    	
    	
    	//Employee e1 = context.getBean("e1", Employee.class);
    	
    	//System.out.println(e1);
    }
}
