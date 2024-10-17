package com.jpa.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.jpa.sts.model.User;
import com.jpa.sts.repository.UserRepositry;

@SpringBootApplication
public class SpringStarterJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringStarterJpaApplication.class, args);
CrudRepository  userRepository =(CrudRepository)context.getBean(UserRepositry.class);
User user=new User();
user.setName("arun");
user.setStatus("i'm a java developer");
User user1=(User) userRepository.save(user);
System.out.println(user1);


	}

}
