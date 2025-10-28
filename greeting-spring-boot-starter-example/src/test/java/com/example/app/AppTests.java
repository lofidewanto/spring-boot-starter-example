package com.example.app;

import com.example.greeting.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTests {

	@Autowired
	GreetingService greetingService;

	@Test
	void contextLoads() {
	}

	@Test
	void testGreetingService() {
		String greeting = greetingService.greet("World");
		assert(greeting.equals("Hello, World!"));
	}
}
