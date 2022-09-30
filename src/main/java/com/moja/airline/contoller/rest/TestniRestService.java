package com.moja.airline.contoller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api"))
public class TestniRestService {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "Test uspješan";
    }

}
