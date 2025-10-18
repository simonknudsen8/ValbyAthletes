package com.valbyAthletes.v1.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valbyAthletes.v1.models.Athlete;
import com.valbyAthletes.v1.models.TashiWazaTechinque;
import com.valbyAthletes.v1.service.AthleteService;
import com.valbyAthletes.v1.service.TechniqueService;







@RequestMapping("")
@Controller
public class AthleteController {

    private final AthleteService athleteService;
    private final TechniqueService techniqueService;

    public AthleteController(AthleteService athleteService, TechniqueService techniqueService){
        this.athleteService = athleteService;
        this.techniqueService = techniqueService;
    }

    @GetMapping("/checkAthlete")
    public String checkAthlete(@RequestParam ("id") int id, Model model) {
        Athlete athlete = athleteService.getAthlete(id);
        model.addAttribute("athlete", athlete);
        List<TashiWazaTechinque> allTechinques = techniqueService.getAllTechniques();
        model.addAttribute("techniques", allTechinques);
        return "checkAthlete";
    }

    @PostMapping("/giveTechnique")
    public String giveTechnique(@RequestParam ("giveTechnique") int techniqueID, 
                                @RequestParam("id") int id, Model model) {
        
        athleteService.giveTechnique(id, techniqueID);
        System.out.println("id = " + id + " and tid = " + techniqueID);


        return "redirect:/checkAthlete?id=" + id;
    }


    @GetMapping("/editAthlete")
    public String editAthlete(@RequestParam("id") int id, Model model){

        return "editAthlete";
    }

    @PostMapping("updateAthlete")
    public String updateAthlete(@RequestParam("id") int id){
        return "redirect:/checkAthlete?=" + id;
    }
    



    


}