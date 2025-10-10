package com.valbyAthletes.v1.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.valbyAthletes.v1.models.Athlete;
import com.valbyAthletes.v1.repository.rowMapper.AthleteRowMapper;


@Repository
public class AthleteRepository {

    private final JdbcTemplate jdbcTemplate;

    public AthleteRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public Athlete getAthlete(int id){

        String sql = "SELECT AthleteID, AthleteName, AthleteBirthday, AthleteBelt, AthleteStance FROM Athlete WHERE AthleteID = ?";
        return jdbcTemplate.queryForObject(sql, new AthleteRowMapper(), id);
    }


    public List<Athlete> getAllUsers(){
       
        String sql = "SELECT AthleteID, AthleteName, AthleteBirthday, AthleteBelt, AthleteStance FROM Athlete";

        return jdbcTemplate.query(sql, new AthleteRowMapper());


    }


}