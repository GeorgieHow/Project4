package com.example.travelappproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelappproject.entity.Cab;
import com.example.travelappproject.repo.CabRepo;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CabServiceRepo {

	@Autowired
	private CabRepo cabRepo;
	
	public List<Cab> getAllCabBookings() {
		return cabRepo.findAll();
	}
	
	public Cab getCabBookingById(int id) {
		if (!cabRepo.existsById(id))
			throw new EntityNotFoundException(id + " not found");
		return cabRepo.findById(id).get();
	}
	
	public Cab addNewBooking(Cab cab) {
		if (cabRepo.existsById(cab.getCabBookingId()))
			throw new EntityExistsException("Cannot add " + cab.getCabBookingId() + " already exists");
		return cabRepo.save(cab);
	}
}
