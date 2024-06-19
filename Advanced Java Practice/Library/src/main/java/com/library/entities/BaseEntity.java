package com.library.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass 
@Getter
@Setter
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@CreationTimestamp //to auto generate creation date
	@Column(name="creation_date")
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate creationDate;
	@UpdateTimestamp //to auto generate updation datetime(TS)
	@Column(name="updation_ts")
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime updationTimeStamp;
}
