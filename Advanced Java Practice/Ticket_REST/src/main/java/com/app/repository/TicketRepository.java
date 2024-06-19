package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Ticket;
import com.app.entities.Status;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
	List<Ticket> findByStatus(Status status);
}
