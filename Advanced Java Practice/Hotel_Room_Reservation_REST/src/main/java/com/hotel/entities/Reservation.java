package com.hotel.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Reservation:Reservation ID, guest name, 
// check-in date, check-out date, room ID, total price.

@Entity
@Table(name = "reservation")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends BaseEntity{
	private String guestName;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	@ManyToOne(optional = false)
	@JoinColumn(name = "room_id")
	private Rooms room;
	private double totalPrice;
}
