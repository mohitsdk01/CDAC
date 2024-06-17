package com.recipe.service;

import com.recipe.dto.ApiResponse;
import com.recipe.entities.User;

public interface UserService {

	ApiResponse createUser(User user);

}
