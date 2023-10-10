package com.piragathicarrierulagam.lom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombousinginStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombousinginStsApplication.class, args);
		Employee emp = new Employee();
		emp.setId(11);
		emp.setFirstName("PiragathicarrierUlagam");
		emp.setLastName("Raja");
		System.out.println("Employee Id: " + emp.getId());
		System.out.println("Employee First Name: " + emp.getFirstName());
		System.out.println("Employee Last Name: " +emp.getLastName());
		
	}

}
