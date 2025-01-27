package com.example.travelappproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.travelappproject.entity.Cab;
import com.example.travelappproject.repo.CabRepo;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class TravelappprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TravelappprojectApplication.class, args);
	}
	

	@Autowired
	CabRepo cabRepo;
	
	@PostConstruct
	public void initialize() {
		Cab cab1 = new Cab("One House", "Another House", "Cab 1", 40);
		Cab cab2 = new Cab("A random house", "Another house", "Cab 2", 40);
		cabRepo.save(cab1);
		cabRepo.save(cab2);
	}
}
