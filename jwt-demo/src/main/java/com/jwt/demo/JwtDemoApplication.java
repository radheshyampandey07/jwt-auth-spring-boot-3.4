package com.jwt.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

import com.jwt.demo.config.BeanScope;
import com.jwt.demo.user.User;

@SpringBootApplication
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);

		try (AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScope.class)) {
			User user1 = applicationContext.getBean("getuser", User.class);
			user1.setName("1st Bean");
			System.out.println("hashcode of : " + user1.getName() + user1.hashCode());

			User user2 = applicationContext.getBean("getuser", User.class);
			user2.setName("2nd Bean");
			System.out.println("hashcode of : " + user2.getName() + user2.hashCode());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Or define constants for better readability
	public static final String GREEN_BOLD = "\u001B[1;32m";
	public static final String RESET = "\u001B[0m";

	@Bean
	public String checkApp() {
		System.out.println(GREEN_BOLD + "Hello world! JWT Demo project has been started." + RESET);
		return "Hello world! This project has been started.";
	}

}
