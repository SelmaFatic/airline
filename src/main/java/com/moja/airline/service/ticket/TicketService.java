package com.moja.airline.service.ticket;

import com.moja.airline.entity.ticket.Ticket;
import com.moja.airline.entity.ticket.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;


    public List<Ticket> getTickets(){
        return ticketRepository.findAll();
    }

    public void save(Ticket ticket){
        ticketRepository.save(ticket);
    }


    public Optional<Ticket> findById(Long id){
        return ticketRepository.findById(id);
    }


    public void delete(Long id){
        ticketRepository.deleteById(id);
    }
}


