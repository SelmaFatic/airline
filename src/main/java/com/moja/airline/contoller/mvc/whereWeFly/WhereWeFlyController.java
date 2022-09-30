package com.moja.airline.contoller.mvc.whereWeFly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WhereWeFlyController {
    @GetMapping("/whereWeFly")
    public String getWhereWeFly(){
        return "whereWeFly";
    }
}
