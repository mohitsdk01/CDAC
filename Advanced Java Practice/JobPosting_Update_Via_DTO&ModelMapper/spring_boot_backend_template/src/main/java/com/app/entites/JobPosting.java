package com.app.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job")
public class JobPosting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	
	@Column(name="Company_Name")
	private String Cname;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Requirements")
	private String requirements;
	
	@Column(name="Salary")
	private int Salary;
	
	@Column(name="Posting_Date")
	@CreationTimestamp
	private LocalDate postdate;
	

}
