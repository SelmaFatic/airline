package com.moja.airline.contoller.mvc.termsAndConditions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TermsAndConditionsController {

    @GetMapping("/termsAndConditions")
    public String getInfo(){
        return "terms_and_conditions";
    }



}
