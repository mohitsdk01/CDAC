package com.automobile.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle extends BaseEntity {
	@NotBlank
	private String vehicleName;
	@Enumerated(EnumType.STRING)
	private Company company;
	@NotBlank
	private String vehicleNumber;
	@NotBlank
	private String vehicleType;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId")
	User user;
}
