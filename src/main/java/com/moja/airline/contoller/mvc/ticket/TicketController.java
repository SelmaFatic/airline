package com.moja.airline.contoller.mvc.ticket;

import com.moja.airline.entity.destination.Destination;
import com.moja.airline.entity.ticket.Ticket;
import com.moja.airline.entity.user.User;
import com.moja.airline.service.ticket.TicketService;
import com.moja.airline.service.user.UserService;
import com.moja.airline.service.destination.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

   @Autowired
   private DestinationService destinationService;


    @GetMapping("/ticket")
    public String getTickets(Model model){
        List<Ticket>ticketList=ticketService.getTickets();
        model.addAttribute("ticket", ticketList);
        return "ticket";
    }

    //http://localhost:8080/addProduct GET
    @GetMapping("/addTicket")
    public String showAddTicketForm(Model model){
        Ticket ticket=new Ticket();
        model.addAttribute("ticket", ticket);
        List<Destination> destinations =destinationService.getAllDestinations();
        model.addAttribute("destinations", destinations);
        return "add_ticket";
    }


    @RequestMapping("ticket/findById")
    @ResponseBody
        public Optional<Ticket> findById(Long id){
        return ticketService.findById(id);

    }
    //@RequestMapping(value="/ticket/update", method ={RequestMethod.PUT, RequestMethod.GET })
   // public String update(Ticket ticket){
     //   ticketService.save(ticket);
     //   return "redirect:/ticket";
    //}

   // @RequestMapping(value = "/ticket/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    //public String delete(Long id){
      //  ticketService.delete(id);
       // return "redirect:/ticket";
    //}



    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket){
        try {
            ticketService.save(ticket);
            return "redirect:/ticket";
        }catch (Exception e){
            return "redirect:/saveTicket?error";
        }
    }

    @GetMapping("/note")
    public String showNote(){
        return "note";
    }



}
