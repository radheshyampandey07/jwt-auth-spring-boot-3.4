package com.jwt.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jwt.demo.user.User;

@Configuration
public class BeanScope {

	// by default all beans are singelton
	@Bean
//	@Scope("request")
	public User getuser() {
		User user = new User();
//		System.out.println("1. user hashcode : " + user.hashCode());
		return user;
	}

}
