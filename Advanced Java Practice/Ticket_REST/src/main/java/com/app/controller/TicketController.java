package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Status;
import com.app.entities.Ticket;
import com.app.service.TicketService;

@RestController
@RequestMapping("tickets")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping
	public ResponseEntity<?> createNewTicket(@RequestBody Ticket ticket){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(ticketService.createTicket(ticket));
	}
	
	@PatchMapping("/{ticketId}")
	public ResponseEntity<?> updateTicket
	(@PathVariable Long ticketId, @RequestParam Status status,
			@RequestParam String resoultionDetails,
			@RequestParam String resolutionDateTime){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(ticketService.updateTicket(ticketId, status, resoultionDetails, resolutionDateTime));
	}
	
	@GetMapping("/openTickets")
	public List<Ticket> getOpenTickets(){
		return ticketService.getAllOpenTickets();
	}
	
	@GetMapping("/{ticketId}")
	public Ticket getTicketById(@PathVariable Long ticketId){
		return ticketService.getTicketById(ticketId);
	}
}
