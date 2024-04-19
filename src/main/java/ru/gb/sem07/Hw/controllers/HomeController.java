package ru.gb.sem07.Hw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/public-data")
    public String publicData() {
        return "public-data";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "private-data";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }


}
