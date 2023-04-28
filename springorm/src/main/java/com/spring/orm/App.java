package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	//Student student = new Student(2324, "Mayank", "Delhi");
    	//int r = studentDao.insert(student);
    	//System.out.println("Done" + r);
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean go =true; 
    	while(go)
    	 {
    		System.out.println("Press 1 for add new student");
    		System.out.println("Press 2 for display all students");
    		System.out.println("Press 3 for get detail of single student");
    		System.out.println("Press 4 for delete students");
    		System.out.println("Press 5 for update student");
    		System.out.println("Press 6 for exit");
    		
    		try
    		{
    			int input = Integer.parseInt(br.readLine());
    			
    			switch (input) {
				case 1:
					//add a new student
					//taking inputs from users
					System.out.println("Enter user id : ");
					int uId = Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name : ");
					String uName = br.readLine();
					
					System.out.println("Enter user city : ");
					String uCity = br.readLine();
					
					//creating student object and setting values
					Student s = new Student();
					s.setStudentId(uId);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					
					//saving student object to database by calling insert of student dao
					int r = studentDao.insert(s);
					System.out.println(r + "student added");
					System.out.println("*****************");
					System.out.println();
					break;
				case 2:
					//display all student
					System.out.println("*****************");
					List<Student> allStudents = studentDao.getAllStudents();
					for(Student st:allStudents)
					{
						System.out.println("Id : " + st.getStudentId());
						System.out.println("Name : " + st.getStudentName());
						System.out.println("City : " + st.getStudentCity());
						System.out.println("-----------------------------");
					}
					System.out.println("*********************************");
					break;
				case 3:
					//get single student data
					System.out.println("Enter student id : ");
					int userId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(userId);
					System.out.println("Id : " + student.getStudentId());
					System.out.println("Name : " + student.getStudentName());
					System.out.println("City : " + student.getStudentCity());
					System.out.println("-----------------------------");
					break;
				case 4:
					//delete student
					System.out.println("Enter student id : ");
					int id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student deleted.......");

					break;
				case 5:
					//update the student
					System.out.println("Enter user id : ");
					int uId1 = Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name : ");
					String uName1 = br.readLine();
					
					System.out.println("Enter user city : ");
					String uCity1 = br.readLine();
					
					//creating student object and setting values
					Student s1 = new Student();
					s1.setStudentId(uId1);
					s1.setStudentName(uName1);
					s1.setStudentCity(uCity1);
					
					studentDao.updateStudent(s1);
					System.out.println("student added");
					System.out.println("*****************");
					System.out.println();
					break;
				case 6:
					//exit
					go = false;
					break;
				}
    		}
    		
    		catch(Exception e)
    		{
    			System.out.println("Invalid input try with another one !!");
    			System.out.println(e.getMessage());
    		}
    		
    	 }
    	System.out.println("Thankyou for using my application");
    	System.out.println("See you soon !!");
    	 
    }
}
