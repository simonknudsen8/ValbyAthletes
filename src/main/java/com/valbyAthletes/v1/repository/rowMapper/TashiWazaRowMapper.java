package com.valbyAthletes.v1.repository.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.valbyAthletes.v1.models.TashiWazaTechinque;



public class TashiWazaRowMapper implements RowMapper<TashiWazaTechinque> {


    @Override
    public TashiWazaTechinque mapRow(ResultSet rs, int rowNum) throws SQLException{

        int id = rs.getInt("TashiWazaID");
        String name = rs.getString("TashiWazaName");
        String type = rs.getString("TashiWazaType");

        return new TashiWazaTechinque(id, name, type);


    }
}
