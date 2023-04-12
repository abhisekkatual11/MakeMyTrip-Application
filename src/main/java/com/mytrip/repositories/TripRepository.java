package com.mytrip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytrip.entities.Trip;

public interface TripRepository extends JpaRepository<Trip,Long> {

}
