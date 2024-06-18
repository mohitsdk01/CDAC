package com.institute.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student extends BaseEntity{
	@NotBlank
	private String studentName;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String password;
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
}
