package com.hotel.service;

import java.util.List;

import com.hotel.dto.ApiResponse;
import com.hotel.entities.Rooms;

public interface RoomsService {
	ApiResponse createRoom(Rooms room);
	List<Rooms> getAvailableRoms();
}
