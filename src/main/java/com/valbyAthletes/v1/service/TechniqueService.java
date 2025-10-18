package com.valbyAthletes.v1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.valbyAthletes.v1.models.TashiWazaTechinque;
import com.valbyAthletes.v1.repository.TechniqueRepository;

@Service
public class TechniqueService {
    
    private final TechniqueRepository techniqueRepository;


    public TechniqueService(TechniqueRepository techniqueRepository){
        this.techniqueRepository = techniqueRepository;
    }



    public List<TashiWazaTechinque> getAllTechniques(){
        return techniqueRepository.getAllTechniques();
    }

    

    
}
