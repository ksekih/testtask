package com.example.testtask;

import com.example.testtask.domain.User;
import com.example.testtask.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TesttaskApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TesttaskApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setUsername("user2");
		user.setEmail("user2@gmail.com");
		userRepository.save(user);
		System.out.println("bla bla");
	}

}
