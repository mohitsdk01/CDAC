package com.hotel.service;

import java.util.List;

import com.hotel.dto.ApiResponse;
import com.hotel.entities.Reservation;
import com.hotel.entities.Rooms;

public interface ReservationService {

//	ApiResponse createReservation(Reservation reservation);
	ApiResponse createReservation
	(Long roomId, String guestName, String checkInDate, String checkOutDate);

	List<Rooms> getAvailableRooms();

	ApiResponse cancelReservation(Long reservationId);

}
