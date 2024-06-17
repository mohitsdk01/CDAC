package com.automobile.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobile.dto.ApiResponse;
import com.automobile.entities.User;
import com.automobile.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public ApiResponse createUser(User user) {
		userRepo.save(user);
		return new ApiResponse("User Registered.");
	}
	
	
}
