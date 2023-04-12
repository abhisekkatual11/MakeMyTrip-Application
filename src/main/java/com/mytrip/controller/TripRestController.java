package com.mytrip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.entities.Trip;
import com.mytrip.repositories.TripRepository;

@RestController
public class TripRestController {
	@Autowired
	private TripRepository tripRepo;
	
	//http://localhost:8080/api/all
	@GetMapping("/api/all")
	public List<Trip> showRecord(Trip trip) {
		List<Trip> list = tripRepo.findAll();
		return list;
	}
	
	//http://localhost:8080/api/save
	@PostMapping("/api/save")
	public void saveRecord(@RequestBody Trip trip) {
		tripRepo.save(trip);
	}

	//http://localhost:8080/api/update/123456789541
	@PutMapping("/api/update/{aadharId}")
	public void updateRecord(@RequestBody Trip trip) {
		tripRepo.save(trip);
	}

	//http://localhost:8080/api/delete/123456789541
	@DeleteMapping("/api/delete/{aadharId}")
	public void deleteRecord(Long aadharId) {
		tripRepo.deleteById(aadharId);
	}

	//http://localhost:8080/api/findById/7777777777
	@GetMapping("/api/findById/{aadharId}")
	public Trip getOneRecord(Long aadharId) {
		Optional<Trip> id = tripRepo.findById(aadharId);
		Trip trip = id.get();
		return trip;
	}
}
