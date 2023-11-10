package com.cogent.SpringBeanLifeCycle.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	int id;
	String name;

	@PreDestroy
	public void preDestroy() {
		System.out.println("Spring @Bean Pre Destroy Annotation Method");

	}

	@PostConstruct
	public void postEmployeeCreation() {
		System.out.println("Spring Bean Post Construct Annotation Method");
	}

	public void init() {
		System.out.println("Spring @Bean Initialization Method   Call");
	}

	public void destroy() {
		System.out.println("Spring @Bean Destroy Method");
	}

}
