package com.cogent.SpringBeanLifeCycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cogent.SpringBeanLifeCycle.entity.Employee;

@Configuration
public class EmployeeConfig {
@Bean(initMethod = "init", destroyMethod = "destroy")
    public Employee getEmpInstance() {
        return new Employee();
    }
}
