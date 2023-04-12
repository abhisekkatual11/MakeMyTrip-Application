package com.mytrip.services;

import java.util.List;

import com.mytrip.entities.Trip;

public interface TripService {

	public void save(Trip trip);

	public List<Trip> showAll();

	public Trip updateRecord(long aadharId);

	public void deleteRecord(long aadharId);
	
}
