package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.entities.Status;
import com.app.entities.Ticket;



public interface TicketService {

	ApiResponse createTicket(Ticket ticket);

	ApiResponse updateTicket(Long ticketId, Status status, String resoultionDetails, String resolutionDateTime);

	List<Ticket> getAllOpenTickets();

	Ticket getTicketById(Long ticketId);


}
