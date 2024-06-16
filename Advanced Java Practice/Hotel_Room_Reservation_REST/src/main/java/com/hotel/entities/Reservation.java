package com.hotel.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Reservation:Reservation ID, guest name, 
// check-in date, check-out date, room ID, total price.

@Entity
@Table(name = "rooms")
@Getter
@Setter
@ToString
//@AllArgsConstructor
//@NoArgsConstructor
public class Reservation extends BaseEntity{

}
