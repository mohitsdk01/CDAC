package com.app.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket extends BaseEntity {
	
//	@UniqueElements(message = "Phone Number Must be unique.")
	private String phoneNo;
	@Enumerated(EnumType.STRING)
	private Category category;
	private String issueDetails;
	private String resolutionDetails;
	private Status status = Status.OPEN;
	@Column(name = "ticket_creation_date")
	private LocalDate creationDate;
	private LocalDateTime resolutionDateTime;
	
}
