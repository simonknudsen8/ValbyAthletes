package com.valbyAthletes.v1.repository.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.valbyAthletes.v1.models.Athlete;



public class AthleteRowMapper implements RowMapper<Athlete> {

@Override
public Athlete mapRow(ResultSet rs, int rowNum) throws SQLException{

    int id = rs.getInt("AthleteID");
    String userName = rs.getString("AthleteUserName");
    String email = rs.getString("AthleteEmail");
    String password = rs.getString("AthletePassword");
    String name = rs.getString("AthleteName");
    LocalDate birthday = rs.getDate("AthleteBirthday").toLocalDate();
    String belt = rs.getString("AthleteBelt");
    String stance = rs.getString("AthleteStance");

    return new Athlete(id, userName, email, password ,name, birthday, belt, stance);
}
    

}