package com.moja.airline.contoller.mvc.info;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InfoController {
    @GetMapping("/info")
    public String getInfo(){
        return "info";
    }

    @GetMapping("/cancel")
    public String cancel(){
        return "index";
    }

}
