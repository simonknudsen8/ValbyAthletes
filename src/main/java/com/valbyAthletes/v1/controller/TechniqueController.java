package com.valbyAthletes.v1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valbyAthletes.v1.models.TashiWazaTechinque;
import com.valbyAthletes.v1.service.TechniqueService;


@RequestMapping("")
@Controller
public class TechniqueController {

    private final TechniqueService techniqueService;


    public TechniqueController(TechniqueService techniqueService){
        this.techniqueService = techniqueService;
    }

    @GetMapping("/seeTechniques")
    public String getAllTechniques(Model model){
        List<TashiWazaTechinque> techniques = techniqueService.getAllTechniques();
        model.addAttribute("techniques", techniques);
        return "seeTechniques";
    }
    
}
