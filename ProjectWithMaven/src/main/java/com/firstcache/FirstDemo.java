package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
		
		Session s = factory.openSession();
		
		Student student = s.get(Student.class, 1415);
		System.out.println(student);
		System.out.println("Working something important");
		Student student1 = s.get(Student.class, 1415);
		System.out.println(student1);
		
		System.out.println(s.contains(student1));
		
		s.close();
		factory.close();
	}

}
