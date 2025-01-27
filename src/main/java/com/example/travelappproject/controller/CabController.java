package com.example.travelappproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.travelappproject.entity.Cab;
import com.example.travelappproject.service.CabServiceRepo;

@RestController
@RequestMapping("/cabs")
public class CabController {

	@Autowired
	private CabServiceRepo cabServiceRepo;
	
    @GetMapping
    public List<Cab> getAllCabBookings() {
        return cabServiceRepo.getAllCabBookings();
    }

    @PostMapping
    public ResponseEntity<Cab> addCabBooking(@RequestBody Cab cab) {
        Cab createdCabBooking = cabServiceRepo.addNewBooking(cab);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCabBooking);
    }
	
}
