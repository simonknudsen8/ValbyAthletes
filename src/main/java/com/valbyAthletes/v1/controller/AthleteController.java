package com.valbyAthletes.v1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valbyAthletes.v1.models.Athlete;
import com.valbyAthletes.v1.service.AthleteService;






@RequestMapping("")
@Controller
public class AthleteController {

    private final AthleteService athleteService;

    public AthleteController(AthleteService athleteService){
        this.athleteService = athleteService;
    }
/* 
    @GetMapping("/logIn")
    public String getMethodName(Model model) {
        List<Athlete> athletes = athleteService.getAllAthletes();
        model.addAttribute("athleteList", athletes);
        return "seeAthletes";
    }
*/
    @GetMapping("/checkAthlete/{id}")
    public String getMethodName(@PathVariable int id, Model model) {
        Athlete athlete = athleteService.getAthlete(id);
        model.addAttribute("athlete", athlete);
        return "checkAthlete";
    }
    



    


}