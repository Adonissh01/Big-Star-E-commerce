package com.example.collectibles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.collectibles.beans.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/newUser")
    public String displayRegistrationForm(Model model){
        //to make the data of the form bound to the user model
        model.addAttribute("user", new User());
        return "register-user";

    }
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Valid User user,BindingResult result,Model model){
        //validate & save to db
        return "register-user";

    }

}
