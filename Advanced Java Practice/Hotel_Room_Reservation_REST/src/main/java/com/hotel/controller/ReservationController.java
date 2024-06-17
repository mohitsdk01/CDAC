package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Reservation;
import com.hotel.entities.Rooms;
import com.hotel.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@PostMapping
	public ResponseEntity<?> createReservation
	(@RequestParam Long roomId, @RequestParam String guestName, 
			@RequestParam String checkInDate, @RequestParam String checkOutDate){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(reservationService.createReservation(roomId, guestName, checkInDate,checkOutDate));
	}
	
	@GetMapping("/rooms")
	public List<Rooms> getAvailableRooms(){
		return reservationService.getAvailableRooms();
	}
	
	@DeleteMapping("/cancel/{reservationId}")
	public ResponseEntity<?> cancelReservation(@PathVariable Long reservationId){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(reservationService.cancelReservation(reservationId));
	}
}
