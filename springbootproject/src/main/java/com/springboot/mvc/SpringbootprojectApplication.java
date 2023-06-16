package com.springboot.mvc;

import com.springboot.mvc.dao.UserRepository;
import com.springboot.mvc.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootprojectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Pratibha");
		user.setCity("Noida");
		user.setStatus("I am java programmer");

		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
