package com.jenks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class HomeController {


    @GetMapping
    public ResponseEntity<String> home(){

        return ResponseEntity.ok("Lauda");
    }


    @RequestMapping("/about")
    public String about(Model model){

        model.addAttribute("HTML", "Welcome to jenks");
        return "about";
    }

}
