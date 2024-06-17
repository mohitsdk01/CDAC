package com.recipe.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.dto.ApiResponse;
import com.recipe.entities.User;
import com.recipe.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public ApiResponse createUser(User user) {
		userRepo.save(user);
		return new ApiResponse("User Registered." + user.getId());
	}

}
