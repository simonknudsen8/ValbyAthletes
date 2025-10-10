package com.valbyAthletes.v1.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.valbyAthletes.v1.models.User;
import com.valbyAthletes.v1.repository.rowMapper.UserRowMapper;


@Repository
public class UserRepository{

    private final JdbcTemplate jdbcTemplate;


    public UserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public User getUser(int id){
        String sql = "SELECT User.UserID, User.Username, User.Email, User.UserPassword FROM User WHERE UserID = ?";

        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
    }
// probably will change it in the future
    public User getUser(String email, String password){
        String sql = "SELECT User.UserID, User.Username, User.Email, User.UserPassword FROM User WHERE Email = ? AND UserPassword = ?";

        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), email, password);
    }

    public List<User> getAllUsers(){
        String sql = "SELECT User.UserID, User.Username, User.Email, User.UserPassword FROM User";

        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    public boolean checkLogIn(String email, String password){

        try {
        String sql = "SELECT COUNT(*) FROM User WHERE Email = ? AND UserPassword = ?";

        Integer result = jdbcTemplate.queryForObject(sql, Integer.class, email, password);

        return result == 1;
    } catch (EmptyResultDataAccessException e){
        return false;
    }
    }
}