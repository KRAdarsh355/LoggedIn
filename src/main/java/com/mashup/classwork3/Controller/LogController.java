package com.mashup.classwork3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
 public class LogController {

    @GetMapping("/home")
    public String home(Model m) {
    	
        String welcomeMessage = "Learning never stops with age.";
        String header="<h1>Hello from Spring Boot!</h1>";
        boolean loginStatus= false;
        m.addAttribute("message", welcomeMessage);
        m.addAttribute("heading",header);
        m.addAttribute("logg",loginStatus);
        
        return "log";
    }
    
}