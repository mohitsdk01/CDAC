package com.recipe.service;

import com.recipe.dto.ApiResponse;
import com.recipe.entities.Recipe;

public interface RecipeService {

	ApiResponse createRecipe(Recipe recipe);

	Recipe getRecipeById(Long recipeId);

	ApiResponse updateRecipe(Long recipeId, Recipe recipe);

	ApiResponse deleteRecipe(Long recipeId);

}
