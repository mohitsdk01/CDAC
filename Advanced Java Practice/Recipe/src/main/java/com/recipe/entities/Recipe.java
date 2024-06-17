package com.recipe.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Recipe can have attributes like Recipe ID, title, description, 
 * ingredients, instructions, difficulty level, cuisine type, author (user ID), creation date.
 */

@Entity
@Table(name = "recipe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Recipe extends BaseEntity {
	private String title;
	private String description;
	private String ingredients;
	private String instructions;
	private Difficulty difficultyLevel;
	private String cusineType;
	@ManyToOne
	@JoinColumn(nullable = false)
	private User author;
	private LocalDate date;
}
