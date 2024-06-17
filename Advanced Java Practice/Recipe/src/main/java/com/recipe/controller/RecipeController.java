package com.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.entities.Recipe;
import com.recipe.service.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@PostMapping
	public ResponseEntity<?> createRecipe(@RequestBody Recipe recipe){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(recipeService.createRecipe(recipe));
	}
	
	@GetMapping("/{recipeId}")
	public ResponseEntity<?> getRecipeById(@PathVariable Long recipeId){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(recipeService.getRecipeById(recipeId));
	}
	
	@PutMapping("/{recipeId}")
	public ResponseEntity<?> updateRecipe(@PathVariable Long recipeId, @RequestBody Recipe recipe){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(recipeService.updateRecipe(recipeId, recipe));
	}

}
