package com.jpa.test;

import java.util.List;
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
		/*User user=new User();
		user.setName("Punit Kumar Tiwari");
		user.setCity("Gorakhpur");
		user.setStatus("I am a java programmer.");
		userrepo.save(user);*/
		
		
		/*
		 * User user1=new User(); user1.setName("Navneet Kumar Tiwari");
		 * user1.setCity("Gorakhpur"); user1.setStatus("I am a python programmer.");
		 * //userrepo.save(user1);
		 * 
		 * User user2=new User(); user2.setName("Tripti Tiwari");
		 * user2.setCity("Gorakhpur"); user2.setStatus("I am a not programmer.");
		 * 
		 * List<User> userlist=List.of(user1,user2);
		 * 
		 * Iterable<User> iter=userrepo.saveAll(userlist);
		 * 
		 * System.out.print("Saved users are:");
		 * 
		 * iter.forEach(System.out::println); System.out.print("Done....");
		 * 
		 * Optional<User> useroptional=userrepo.findById(1);
		 * System.out.println(useroptional.isPresent()?useroptional.get()
		 * :"No User Found !");
		 */
		
		//you can use this to delete
		userrepo.deleteAll();
	}

}
