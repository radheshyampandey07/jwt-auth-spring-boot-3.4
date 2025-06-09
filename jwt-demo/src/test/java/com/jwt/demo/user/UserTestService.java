package com.jwt.demo.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTestService {

	@Autowired
	private UserService userService;

	@Test
	public void checkTest() {
		assertEquals(4, 2 + 2);
	}

}
