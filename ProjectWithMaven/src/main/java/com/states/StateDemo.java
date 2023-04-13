package com.states;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {

	public static void main(String[] args) {
		//Practical of Hibernate object states:
		//Transient
		//Persistent
		//Detached
		//Remove
		
		System.out.println("Example :");
		
		SessionFactory f = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
		
		//Creating student object:
		Student student = new Student();
		student.setId(1414);
		student.setName("Peter");
		student.setCity("ABC");
		
		Certificate certificate = new Certificate();
        certificate.setCourse("Java Hibernate Course");
        certificate.setDuration("2 Months");
        student.setCerti(certificate);
        
        Student student1 = new Student();
		student1.setId(1415);
		student1.setName("Rohan");
		student1.setCity("Noida");
		
		Certificate certificate1 = new Certificate();
        certificate1.setCourse("Core Java Course");
        certificate1.setDuration("3 Months");
        student1.setCerti(certificate1);

        Student student2 = new Student();
		student2.setId(1416);
		student2.setName("Sony");
		student2.setCity("Lucknow");
		
		Certificate certificate2 = new Certificate();
        certificate2.setCourse("Spring Java Course");
        certificate2.setDuration("4 Months");
        student2.setCerti(certificate2);

        
        //student : Transient
        
        Session s = f.openSession();
        
        Transaction tx = s.beginTransaction();
        
        s.save(student);
        s.save(student1);
        s.save(student2);
        //student: Persistent - session,database
        
        //student.setName("John");
        
        tx.commit();
		
		s.close();
		//student : Detached
		student.setName("Sachin");
		System.out.println(student);
		
		f.close();
	}

}
