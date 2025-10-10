package com.valbyAthletes.v1.service;

import org.springframework.stereotype.Service;

import com.valbyAthletes.v1.models.User;
import com.valbyAthletes.v1.repository.UserRepository;


@Service
public class UserService {
    
    public UserRepository userRepository;


    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public User getUser(String email, String password){
        return userRepository.getUser(email, password);
    }

    public boolean checkLogIn(String email, String password){
        return userRepository.checkLogIn(email, password);
    }
}
