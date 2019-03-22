package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TipRepository  {

    @Autowired
    private DataSource dataSource;

    public List<ReportedSuspicions> getAllTips() {


        List<ReportedSuspicions> tipsList = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM TIPS")) {
            while (rs.next()) {
                tipsList.add(rsReportedSuspicions(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipsList;
    }

    public ReportedSuspicions rsReportedSuspicions(ResultSet rs) throws SQLException {
        return new ReportedSuspicions(rs.getLong("id"),
                rs.getString("crime"),
                rs.getString("textbox"),
                rs.getString("location"),
                rs.getFloat("latitude"),
                rs.getFloat("longitude"),
                rs.getString("date1"),
                rs.getString("time1")
        );


    }

    public void addTip(ReportedSuspicions reportedSuspicions){
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1, TIME1) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(2,reportedSuspicions.getCrime());
            ps.setString(3,reportedSuspicions.getTextbox());
            ps.setString(4,reportedSuspicions.getLocation());
            ps.setFloat(5,reportedSuspicions.getLatitude());
            ps.setFloat(6,reportedSuspicions.getLongitude());
            ps.setString(7,reportedSuspicions.getDate1());
            ps.setString(8,reportedSuspicions.getTime1());

            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }



}
