package com.jobs.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class JobDTO {
	private String title;
	private String companyName;
	private String location;
	private String description;
	private String requirements;
	private double salary;
	private LocalDate postingDate;
}
