package com.mytrip.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrip.entities.Trip;
import com.mytrip.repositories.TripRepository;

@Service
public class TripServiceImpl implements TripService {
	
	@Autowired
	private TripRepository tripRepo;
	
	@Override
	public void save(Trip trip) {
		tripRepo.save(trip);
	}

	@Override
	public List<Trip> showAll() {
		List<Trip> all = tripRepo.findAll();
		return all;
	}

	@Override
	public Trip updateRecord(long aadharId) {
		Optional<Trip> byId = tripRepo.findById(aadharId);
		Trip trip = byId.get();
		return trip;
	}

	@Override
	public void deleteRecord(long aadharId) {
		tripRepo.deleteById(aadharId);
	}
}
