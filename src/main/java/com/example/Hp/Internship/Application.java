package com.example.Hp.Internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.Hp.Manager.EmployeeManager;

@SpringBootApplication
public class Application {

    @Bean
    public EmployeeManager employeeManager() {
        return new EmployeeManager();
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
