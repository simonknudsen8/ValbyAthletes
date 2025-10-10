package com.valbyAthletes.v1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valbyAthletes.v1.models.Athlete;
import com.valbyAthletes.v1.service.AthleteService;
import com.valbyAthletes.v1.service.UserService;




@RequestMapping("")
@Controller
public class UserController {

    private final UserService userService;
    private final AthleteService athleteService;


    public UserController(UserService userService, AthleteService athleteService){
        this.userService = userService;
        this.athleteService = athleteService;
    }


    @GetMapping("/logIn")
    public String LogIn( String email, String password, Model model) {
        System.out.println(email + " " + password);
        if (userService.checkLogIn(email, password)){
            List<Athlete> athletes = athleteService.getAllAthletes();
        model.addAttribute("athleteList", athletes);
            return "seeAthletes";
        } else {
            model.addAttribute("WrongInput", true);
            return "index";
        }
    }
   
}
