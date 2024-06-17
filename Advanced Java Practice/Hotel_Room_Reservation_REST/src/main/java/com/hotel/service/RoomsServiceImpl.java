package com.hotel.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.ApiResponse;
import com.hotel.entities.Rooms;
import com.hotel.repository.RoomsRepository;

@Service
@Transactional
public class RoomsServiceImpl implements RoomsService {

	@Autowired
	RoomsRepository roomsRepo;
	
	@Override
	public ApiResponse createRoom(Rooms room) {
		roomsRepo.save(room);
		return new ApiResponse("Room Added.");
	}

	@Override
	public List<Rooms> getAvailableRoms() {
		return roomsRepo.findAll();
	}

}
