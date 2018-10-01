package com.example.demo;

import com.example.demo.model.UserEntity;
import com.example.demo.model.UserRole;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		// JPA MAIN
		/*
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		userRepository.save(new UserEntity("윤사장", 60, UserRole.ADMIN));
		UserEntity user = userRepository.findByUserName("윤사장");
		System.out.println("나이:" + user.getAge() + "," + "이름:" + user.getUserName() + "," + "생성일:" + user.getCreatedAt());
		*/

		// Many To One
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		SchoolService schoolService = context.getBean(SchoolService.class);

		schoolService.findStudentInfo();
	}
}
