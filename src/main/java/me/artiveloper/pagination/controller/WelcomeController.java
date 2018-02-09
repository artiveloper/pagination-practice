package me.artiveloper.pagination.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){
        return "index";
    }

}
