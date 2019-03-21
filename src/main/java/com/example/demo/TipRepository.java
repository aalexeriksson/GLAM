package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class TipRepository  {

    @Autowired
    private DataSource dataSource;

    public void addTip(String crime){
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO TIPS(CRIME) VALUES(?)");
            ps.setString(1,crime);

            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }



}
