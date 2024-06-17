package com.jobs.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Entity JobPosting can have attributes like Job title
 *, company name, location, description, requirements, salary, and posting date.
 */

@Entity
@Table(name = "jobs")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Job extends BaseEntity{
	private String title;
	private String companyName;
	private String location;
	private String description;
	private String requirements;
	private double salary;
	private LocalDate postingDate;
}
