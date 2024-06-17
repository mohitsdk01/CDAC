package com.heathcare.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "doctor")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends BaseEntity {
	@Column(name = "doctor_name")
	private String docName;
}
