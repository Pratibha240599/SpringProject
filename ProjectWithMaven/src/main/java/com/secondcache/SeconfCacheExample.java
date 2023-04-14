package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SeconfCacheExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
		
		Session s1 = factory.openSession();
		Student student = s1.get(Student.class, 1415);
		System.out.println(student);
		
		s1.close();
		
		
		Session s2 = factory.openSession();
		Student student1 = s2.get(Student.class, 1415);
		System.out.println(student1);
		
		s2.close();
	}

}
