package com.jwt.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
		// disable csrf
		security.csrf(customizer -> customizer.disable())
				// authenticate any form request
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				// enable form login
				.formLogin(Customizer.withDefaults())
				// for other rest requests
				.httpBasic(Customizer.withDefaults());
		return security.build();
	}

}
