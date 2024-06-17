package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.Reservation;
import com.hotel.entities.Rooms;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
