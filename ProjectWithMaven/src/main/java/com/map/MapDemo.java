package com.map;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("com/tut/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

		
		/*
		 * Question q1 = new Question(); q1.setQuestionId(1212);
		 * q1.setQuestion("what is java ?");
		 * 
		 * Answer answer = new Answer(); answer.setAnswerId(343);
		 * answer.setAnswer("Java is a programing language"); answer.setQuestion(q1);
		 * 
		 * Answer answer1 = new Answer(); answer1.setAnswerId(33);
		 * answer1.setAnswer("With the help of java we can create softwares");
		 * answer1.setQuestion(q1);
		 * 
		 * Answer answer2 = new Answer(); answer2.setAnswerId(363);
		 * answer2.setAnswer("Java has different types of frameworks");
		 * answer2.setQuestion(q1);
		 * 
		 * List<Answer> list = new ArrayList<Answer>(); list.add(answer);
		 * list.add(answer1); list.add(answer2); q1.setAnswers(list);
		 */		         
        Session s = factory.openSession();
        
        
        Transaction tx = s.beginTransaction();
        
        
        Question q = (Question) s.get(Question.class, 1212);
        System.out.println(q.getQuestion());
        System.out.println(q.getQuestionId());
        System.out.println(q.getAnswers().size());
        
        
        //for(Answer a:q.getAnswers())
        //{
        	//System.out.println(a.getAnswer());
        //}
        
        //s.save(q1);
        //s.save(answer);
        //s.save(answer1);
        //s.save(answer2);
                
        tx.commit();
        
       //fetching
        /*Question newQ = (Question) s.get(Question.class, 242);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswer());*/
        
        s.close();
        
        factory.close();
	}

}
