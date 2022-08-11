package com.works.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("data", "Ali Bilmem");
        model.addAttribute("email", "ali@mail.com");
        return "login";
    }

}