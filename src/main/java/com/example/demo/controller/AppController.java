package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator/v1")
public class AppController {

	@GetMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		
		return a+b;
	}
	
	@GetMapping("/multiply")
	public int multiplyOne(@RequestParam int a,@RequestParam int b) {
		
		return a*b;
	}
}
