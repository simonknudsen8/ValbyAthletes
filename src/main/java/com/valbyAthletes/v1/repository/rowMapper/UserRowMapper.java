package com.valbyAthletes.v1.repository.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.valbyAthletes.v1.models.User;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException{

        int id = rs.getInt("UserID");
        String userName = rs.getString("UserName");
        String email = rs.getString("Email");
        String password = rs.getString("UserPasword");

        return new User(id, userName, email, password);


    }
    
}
