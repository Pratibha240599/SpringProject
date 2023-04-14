package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
		
		Session s = factory.openSession();
		
		String q = "select * from Student";
		
		NativeQuery nq = s.createSQLQuery(q);
		
		List<Object[]> list = nq.list();
		
		for(Object[] student:list)
		{
			System.out.println(student[1] +" : "+ student[4]);
		}
		
		s.close();
		factory.close();
	}

}
