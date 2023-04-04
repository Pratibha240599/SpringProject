package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started...." );
        //spring jdbc=> JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        //INSERT
        Student student = new Student();
        student.setId(666);
        student.setName("Pratibha");
        student.setCity("Noida");
        
        int result = studentDao.insert(student);
        
        System.out.println("student added" + result);
        
        //UPDATE
        /*Student student = new Student();
        student.setId(222);
        student.setName("Sony");
        student.setCity("Delhi");
        
        int result = studentDao.change(student);
        System.out.println("Data changed" + result);
        
        //DELETE
        Scanner student = new Scanner(System.in);
        System.out.println("Enter StudentId");
        int result = student.nextInt();
        int delete = studentDao.delete(result);
        
        System.out.println("delete successfull=" + delete);
        
        //Single Student Data
        Student student = studentDao.getStudent(455);
        System.out.println(student);*/
        
        //Multiple Student Data
        List<Student> students = studentDao.getAllStudents();
        for(Student s :students)
        {
        	System.out.println(s);
        }
    }
}
