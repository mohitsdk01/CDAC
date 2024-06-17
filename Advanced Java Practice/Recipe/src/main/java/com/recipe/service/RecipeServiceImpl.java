package com.recipe.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.recipe.custom_exceptions.ResourceNotFoundException;
import com.recipe.dto.ApiResponse;
import com.recipe.entities.Recipe;
import com.recipe.entities.User;
import com.recipe.repository.RecipeRepository;
import com.recipe.repository.UserRepository;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	RecipeRepository recipeRepo;
	
	@Autowired
//	@Qualifier(value = "save")
	UserRepository userRepo;
	
	
	@Override
	public ApiResponse createRecipe(Recipe recipe) {
		User author = userRepo.getByName(recipe.getAuthor().getName());
		recipe.setAuthor(author);
		recipeRepo.save(recipe);
		return new ApiResponse("Recipe Added.");
	}


	@Override
	public Recipe getRecipeById(Long recipeId) {
		Recipe recipe = recipeRepo.findById(recipeId).orElse(null);
		if(recipe != null) {
			return recipe;
		}
		else
			throw new ResourceNotFoundException("Invalid Recipe Id!");
	}


	@Override
	public ApiResponse updateRecipe(Long recipeId, Recipe recipe) {
		Recipe recipe1 = recipeRepo.findById(recipeId).orElse(null);
		if(recipe != null) {
			recipe1.setTitle(recipe.getTitle());
			recipe1.setIngredients(recipe.getIngredients());
			recipe1.setInstructions(recipe.getInstructions());
			recipe1.setCusineType(recipe.getCusineType());
			recipe1.setTitle(recipe.getTitle());
		}
		return null;
	}
	
	

}
