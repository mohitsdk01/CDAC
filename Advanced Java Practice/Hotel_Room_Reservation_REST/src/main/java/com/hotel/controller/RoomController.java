package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Rooms;
import com.hotel.service.RoomsService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	@Autowired
	RoomsService service;
	
	@PostMapping
	public ResponseEntity<?> createRoom(Rooms room){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(service.createRoom(room));
	}
	
	@GetMapping
	public List<Rooms> getAvailableRooms(){
		return service.getAvailableRoms();
	}
}
