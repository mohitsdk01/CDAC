package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.Rooms;

public interface RoomsRepository extends JpaRepository<Rooms, Long> {
//	@Query("SELECT c FROM Entity c WHERE c.enabled = true")
	
}
