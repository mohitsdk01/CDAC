package com.automobile.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobile.custom_exceptions.ResourceNotFoundException;
import com.automobile.dto.ApiResponse;
import com.automobile.entities.User;
import com.automobile.entities.Vehicle;
import com.automobile.repository.UserRepository;
import com.automobile.repository.VehicleRepository;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Autowired
	UserRepository userRepo;
	

	@Override
	public ApiResponse addVehicle(Vehicle vehicle) {
		String msg = "Vehicle Registration Failed!";
			User user = userRepo.findByUserName(vehicle.getUser().getUserName());
			if(user != null) {
				vehicle.setUser(user);
				vehicleRepo.save(vehicle);
				msg = "Vehicle Registration Successful!";
			}
//		else {
//			throw new ResourceNotFoundException(msg);
//		}
		return new ApiResponse(msg);
	}


	@Override
	public List<Vehicle> getVehiclesByUserName(String userName) {
		User user = userRepo.findByUserName(userName);
		if(user != null) {
			return vehicleRepo.findByUser(user);
		}
		throw new ResourceNotFoundException("User Name Do not exists!");
	}


	@Override
	public ApiResponse deleteVehicleByUserName(String userName) {
		String msg = "Vehicle Deletion Failed!";
		User user = userRepo.findByUserName(userName);
//		Long userId = user.getId();
		if(user != null) {
			vehicleRepo.deleteByUser(user);
			msg = "Vehicle Deleted!";
		}
		return new ApiResponse(msg);
	}
	
}
