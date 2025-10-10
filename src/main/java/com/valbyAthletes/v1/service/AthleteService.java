package com.valbyAthletes.v1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.valbyAthletes.v1.models.Athlete;
import com.valbyAthletes.v1.repository.AthleteRepository;

@Service
public class AthleteService {

    private final AthleteRepository athleteRepository;


    public AthleteService(AthleteRepository athleteRepository){

        this.athleteRepository = athleteRepository;

    }


        public Athlete getAthlete(int id){
            return athleteRepository.getAthlete(id);
        }


        public List<Athlete> getAllAthletes(){
        return athleteRepository.getAllUsers();
        }


}