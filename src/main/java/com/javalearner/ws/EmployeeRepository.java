package com.javalearner.ws;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component
public class EmployeeRepository {
	Employee karuna = new Employee();

	@PostConstruct
	public void initData() {
		
		karuna.setFirstname("karuna");
		karuna.setLastname("sharma");
		karuna.setCity("ranchi");
		karuna.setHobby("singing");
		}

	public Employee getEDmployee() {
		
		return karuna;
	}
}
