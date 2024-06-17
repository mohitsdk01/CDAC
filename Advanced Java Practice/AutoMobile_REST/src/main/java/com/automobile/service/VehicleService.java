package com.automobile.service;

import java.util.List;

import com.automobile.dto.ApiResponse;
import com.automobile.entities.Vehicle;

public interface VehicleService {

	ApiResponse addVehicle(Vehicle vehicle);

	List<Vehicle> getVehiclesByUserName(String userName);

	ApiResponse deleteVehicleByUserName(String userName);

}
