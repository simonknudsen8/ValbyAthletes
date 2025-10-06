package com.valbyAthletes.v1.repository;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate; 
import com.valbyAthletes.v1.models.User;;



@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public User 

}