package com.valbyAthletes.v1.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.valbyAthletes.v1.models.Athlete;
import com.valbyAthletes.v1.repository.rowMapper.AthleteRowMapper;
import com.valbyAthletes.v1.repository.rowMapper.TashiWazaRowMapper;


@Repository
public class AthleteRepository {

    private final JdbcTemplate jdbcTemplate;

    public AthleteRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public Athlete getAthlete(int id){

        String sql = "SELECT * FROM Athlete WHERE AthleteID = ?";
        Athlete athlete = jdbcTemplate.queryForObject(sql, new AthleteRowMapper(), id);

        String sqlForUsedTechniques = "SELECT TashiWazaID, TashiWazaName, TashiWazaType FROM TashiWazaTechnique natural join UsesTashiWaza where athleteID = ?";

        athlete.setFavTechniques(jdbcTemplate.query(sqlForUsedTechniques, new TashiWazaRowMapper(), id));

        return athlete;
    }


    public List<Athlete> getAllUsers(){
       
        String sql = "SELECT * FROM Athlete";

        return jdbcTemplate.query(sql, new AthleteRowMapper());


    }


    public void giveTechnique(int id, int tID){

        String sql = "INSERT INTO UsesTashiWaza(AthleteID, TashiWazaID) VALUES(?,?)";

        jdbcTemplate.update(sql, id, tID);
    }

    public void removeTechnique(int id, int tID){

        String sql = "DELETE FROM UsesTashiWaza WHERE AthleteID = ? AND TashiWazaID = ?";

        jdbcTemplate.update(sql, id, tID);
    }


}