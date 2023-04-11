package com.tut;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("com/tut/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student student1 = new Student();
        student1.setId(1234);
        student1.setName("Pratibha");
        student1.setCity("Hathras");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("6 Months");
        student1.setCerti(certificate);
        
        Student student2 = new Student();
        student2.setId(5678);
        student2.setName("Mithlesh");
        student2.setCity("Vasundra");
        
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Hibernate");
        certificate1.setDuration("1.5 Months");
        student2.setCerti(certificate1);
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(student1);
        session.save(student2);
        tx.commit();

        
        session.close();
        factory.close();



	}

}
