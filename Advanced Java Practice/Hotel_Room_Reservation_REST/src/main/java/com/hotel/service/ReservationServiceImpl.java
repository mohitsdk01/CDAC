package com.hotel.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.ApiResponse;
import com.hotel.entities.Reservation;
import com.hotel.entities.Rooms;
import com.hotel.repository.ReservationRepository;
import com.hotel.repository.RoomsRepository;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationRepository reservationRepo;
	
	@Autowired
	RoomsRepository roomRepo;

//	@Override
//	public ApiResponse createReservation(Reservation reservation) {
//		Reservation reservation1 = new Reservation();
//		reservation1.setGuestName(reservation.getGuestName());
//		reservation1.setCheckInDate(reservation.getCheckInDate());
//		reservation1.setCheckOutDate(reservation.getCheckOutDate());
//		reservation1.setTotalPrice(5000);
////		reservation1.setRoom(reservation.getRoom().getId());
//		
//		reservationRepo.save(null);
//		return new ApiResponse("");
//	}
	
	@Override
	public ApiResponse createReservation
	(Long roomId, String guestName, String checkInDate, String checkOutDate) {
		String msg = "Reservation Failed!";
		Rooms room = roomRepo.findById(roomId).orElse(null);
		Reservation reservation = new Reservation();
		LocalDate inD = LocalDate.parse(checkInDate);
		LocalDate outD = LocalDate.parse(checkOutDate);
		if(room != null) {
			reservation.setGuestName(guestName);
			reservation.setCheckInDate(inD);
			reservation.setCheckOutDate(outD);
			reservation.setRoom(room);
			reservation.setTotalPrice(ChronoUnit.DAYS.between(inD, outD) * 5000);
			reservationRepo.save(reservation);
			msg = "Reservation Successful...";
		}
		else {
			msg = "Room is not available!";
		}
		return new ApiResponse(msg);
	}

	@Override
	public List<Rooms> getAvailableRooms() {
		return null;
	}

	@Override
	public ApiResponse cancelReservation(Long reservationId) {
		reservationRepo.deleteById(reservationId);
		return new ApiResponse("Reservation Cancelled!");
	}
}
