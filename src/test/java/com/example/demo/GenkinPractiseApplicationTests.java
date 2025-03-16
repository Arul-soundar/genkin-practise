package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.AppController;

@SpringBootTest
class GenkinPractiseApplicationTests {
	@Autowired
	 AppController controller;
	 
	
	@Test
	void verifyAdd() {
		assertEquals(5, controller.add(2, 3));
	}
	
	@Test
	void verifyMultiply() {
		assertEquals(5, controller.multiplyOne(1,5));
	}

}
