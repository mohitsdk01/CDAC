package com.library.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "libraries")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Library extends BaseEntity{
	private String name;
	private String location;
	private LocalDate establishedDate;
}
