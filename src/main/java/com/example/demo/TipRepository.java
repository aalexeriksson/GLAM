package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class TipRepository  {

    @Autowired
    private DataSource dataSource;

    public void addTip(ReportedSuspicions reportedSuspicions){
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE) VALUES(?,?,?,?,?)");
            ps.setString(1,reportedSuspicions.getCrime());
            ps.setString(2,reportedSuspicions.getTextbox());
            ps.setString(3,reportedSuspicions.getLocation());
            ps.setFloat(4,reportedSuspicions.getLatitude());
            ps.setFloat(5,reportedSuspicions.getLongitude());

            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }



}
