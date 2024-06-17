package com.hotel.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Room:Room ID, room number, type (single, double, suite), price, availability.
@Entity
@Table(name = "rooms")
@Getter
@Setter
@ToString
//@AllArgsConstructor
//@NoArgsConstructor
public class Rooms extends BaseEntity{
	private Long roomNumber;
	private String roomType;
	private double price;
	private boolean isAvailable;
}
