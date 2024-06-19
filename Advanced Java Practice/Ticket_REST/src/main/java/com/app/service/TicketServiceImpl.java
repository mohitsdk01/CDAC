package com.app.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.entities.Status;
import com.app.entities.Ticket;
import com.app.repository.TicketRepository;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {
	@Autowired
	TicketRepository ticketRepo;

	@Override
	public ApiResponse createTicket(Ticket ticket) {
		String msg = "Ticket Addition Failed!";
		if(ticket != null) {
			ticketRepo.save(ticket);
			msg = "Ticket Addition Successful. id: " + " " + ticket.getId();
		}
		else {
			throw new ResourceNotFoundException("Invalid Ticket!");
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateTicket
	(Long ticketId, Status status,String resoultionDetails, String resolutionDateTime) {
		String msg = "Ticket Addition Failed!";
		Ticket ticket = ticketRepo.findById(ticketId).orElse(null);
		if(ticket != null) {
			ticket.setResolutionDetails(resoultionDetails);
			ticket.setStatus(status);
			ticket.setResolutionDateTime(LocalDateTime.parse(resolutionDateTime));
			ticketRepo.save(ticket);
			msg = "Ticket Addition Susccessful!";
		}
		else {
			throw new ResourceNotFoundException("Invalid Ticket!");
		}
		return new ApiResponse(msg);
	}

	@Override
	public List<Ticket> getAllOpenTickets() {
		return ticketRepo.findByStatus(Status.OPEN);
	}

	@Override
	public Ticket getTicketById(Long ticketId) {
		Ticket ticket = ticketRepo.findById(ticketId).orElse(null);
		if(ticket != null) {
			return ticket;
		}
		else {
			throw new ResourceNotFoundException("Ticket Not Found!");
		}
		
	}
	
	
}
