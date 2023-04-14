package com.mapping.xml;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
		
		Person person = new Person(23, "Ram", "Delhi", "52524");
		
		Session s = factory.openSession();
		
		
		Transaction tx = s.beginTransaction();
		
		s.save(person);
		tx.commit();
		
		s.close();
		factory.close();
	}

}
