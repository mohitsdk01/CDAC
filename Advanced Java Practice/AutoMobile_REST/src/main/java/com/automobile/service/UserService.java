package com.automobile.service;

import com.automobile.dto.ApiResponse;
import com.automobile.entities.User;

public interface UserService {

	ApiResponse createUser(User user);

}
