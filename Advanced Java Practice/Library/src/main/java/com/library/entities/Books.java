package com.library.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Books extends BaseEntity{
	private String title;
	private String author;
	private LocalDate publishedDate;
	@ManyToOne(optional = false)
	@JoinColumn(name = "library_id")
	private Library library;
}
