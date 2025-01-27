package com.example.travelappproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cabBookingId;
	String locationFrom;
	String locationTo;
	String cabType;
	int distance;
	
	public Cab() {
		
	}

	public Cab(int cabBookingId, String locationFrom, String locationTo, String cabType, int distance) {
		this.cabBookingId = cabBookingId;
		this.locationFrom = locationFrom;
		this.locationTo = locationTo;
		this.cabType = cabType;
		this.distance = distance;
	}

	public Cab(String locationFrom, String locationTo, String cabType, int distance) {
		super();
		this.locationFrom = locationFrom;
		this.locationTo = locationTo;
		this.cabType = cabType;
		this.distance = distance;
	}

	public int getCabBookingId() {
		return cabBookingId;
	}

	public void setCabBookingId(int cabBookingId) {
		this.cabBookingId = cabBookingId;
	}

	public String getLocationFrom() {
		return locationFrom;
	}

	public void setLocationFrom(String locationFrom) {
		this.locationFrom = locationFrom;
	}

	public String getLocationTo() {
		return locationTo;
	}

	public void setLocationTo(String locationTo) {
		this.locationTo = locationTo;
	}

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Cab [locationFrom=" + locationFrom + ", locationTo=" + locationTo + ", cabType=" + cabType + "]";
	}
}
