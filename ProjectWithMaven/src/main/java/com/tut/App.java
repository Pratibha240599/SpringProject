package com.tut;

import org.hibernate.Transaction;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
//import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println( "Project Started.." );
    	Configuration cfg = new Configuration();
        cfg.configure("com/tut/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //Creating student
        Student st = new Student();
        st.setId(108);
        st.setName("Mona");
        st.setCity("Hathipur");
        System.out.println(st);
        
        //Creating object of address class
        
        Address ad = new Address();
        ad.setStreet("street2");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        
        //Reading image
        FileInputStream fis = new FileInputStream("src/main/java/Mypic.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        session.save(st);
        session.save(ad);
        transaction.commit();
        session.close();
        System.out.println("Done");
        
    }
}
