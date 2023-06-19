package com.springboot.mvc;

import com.springboot.mvc.dao.UserRepository;
import com.springboot.mvc.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootprojectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		/*User user = new User();
		user.setName("Pratibha");
		user.setCity("Noida");
		user.setStatus("I am java programmer");

		User user1 = userRepository.save(user);
		System.out.println(user1);

		//Create object of User
		User user1 = new User();
		user1.setName("Uttam");
		user1.setCity("city1");
		user1.setStatus("Python Programmer");

		User user2 = new User();
		user2.setName("Ankit");
		user2.setCity("city2");
		user2.setStatus("Java Programmer");


		//saving single user
		//User resultUser = userRepository.save(user2);

		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);

		//save multiple objects
		Iterable<User> result = userRepository.saveAll(users);
		result.forEach(user -> {
			System.out.println(user);
		});


		//System.out.println("saved user "+resultUser);
		System.out.println("done");

		//update the user of id 8
		Optional<User> optional = userRepository.findById(8);
		User user = optional.get();
		user.setName("Ankit Tiwari");
		User result = userRepository.save(user);
		System.out.println(result);

		//how to get the data
		//findById(id)-return Optional Containing your data

		Iterable<User> itr =  userRepository.findAll();
		itr.forEach(user ->
				System.out.println(user));

		//Deleting the user element
		userRepository.deleteById(2);
		System.out.println("deleted");

		Iterable<User> allusers =  userRepository.findAll();
		allusers.forEach(user ->
				System.out.println(user));
		userRepository.deleteAll(allusers);

		List<User> users = userRepository.findByName("Pratibha");
		users.forEach(e ->
				System.out.println(e));

		List<User> users = userRepository.findByNameAndCity("Sumit","Delhi");
		users.forEach(e ->
				System.out.println(e));*/

		List<User> allUser = userRepository.getAllUser();
		allUser.forEach(e ->
				System.out.println(e));

		System.out.println("-------------------------------------------------------");

		List<User> userByName = userRepository.getUserByName("Pratibha","Noida");
		userByName.forEach(e ->
				System.out.println(e));

		System.out.println("--------------------------------------------------------");

		userRepository.getUsers().forEach(e ->System.out.println(e));
	}

}
