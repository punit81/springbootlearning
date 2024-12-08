package com.jpa.test;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userrepo=applicationContext.getBean(UserRepository.class);
		System.out.println(userrepo.findById(1));
		User user=new User();
		user.setName("Punit Kumar Tiwari");
		user.setCity("Gorakhpur");
		user.setStatus("I am a java programmer.");
		userrepo.save(user);
		
		Optional<User> user1=userrepo.findById(1);
		System.out.println(user1.isPresent()?user1.get():"No User Found !");
	}

}
