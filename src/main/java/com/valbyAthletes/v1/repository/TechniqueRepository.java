package com.valbyAthletes.v1.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.valbyAthletes.v1.models.TashiWazaTechinque;
import com.valbyAthletes.v1.repository.rowMapper.TashiWazaRowMapper;


@Repository
public class TechniqueRepository {

    private final JdbcTemplate jdbcTemplate;


    public TechniqueRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<TashiWazaTechinque> getAllTechniques(){
        String sql = "SELECT * FROM TashiWazaTechnique";

        return jdbcTemplate.query(sql, new TashiWazaRowMapper());
    }
    
}
