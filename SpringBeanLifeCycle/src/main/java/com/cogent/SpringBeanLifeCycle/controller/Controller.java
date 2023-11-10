package com.cogent.SpringBeanLifeCycle.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.SpringBeanLifeCycle.entity.Employee; 


@RestController
@CrossOrigin
public class Controller {

	@Autowired
	Employee employee; 
	
	
	
	@GetMapping("/employees")
	String all() {
		System.out.println(employee.getClass());
		employee.destroy();
		return "Hello"; 
	}
}
