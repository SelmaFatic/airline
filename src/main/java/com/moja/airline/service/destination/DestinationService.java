package com.moja.airline.service.destination;

import com.moja.airline.entity.destination.Destination;
import com.moja.airline.entity.destination.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> getAllDestinations(){
        return destinationRepository.findAll();
    }

    public void saveDestination(Destination destination){
        destinationRepository.save(destination);
    }
}


