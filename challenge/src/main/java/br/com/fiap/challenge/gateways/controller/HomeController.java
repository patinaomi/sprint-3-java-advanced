package br.com.fiap.challenge.gateways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    @RequestMapping("/")
    public String getHomePage() {
        return "home_page";
    }




}
