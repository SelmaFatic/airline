package com.moja.airline.contoller.mvc.destination;


import com.moja.airline.entity.destination.Destination;
import com.moja.airline.service.destination.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DestinationController {
    @Autowired
    private DestinationService destinationService;


    @GetMapping("/destination")
    public String getAllProducts(Model model){
        List<Destination> destinations =destinationService.getAllDestinations ();
        model.addAttribute("destinations", destinations);
        return "destination";

    }



}
