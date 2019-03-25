package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class DateAndLocationRepository {

    @Autowired
    private DataSource dataSource;

    public List<DateAndLocation> getAllLocations() {

        List<DateAndLocation> locations = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM DATE_AND_LOCATION")) {
            while (rs.next()) {
                locations.add(rsLocations(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return locations;

    }

    public DateAndLocation rsLocations(ResultSet rs) throws SQLException {
        return new DateAndLocation(rs.getLong("id"),
                rs.getLong("suspicion_id"),
                rs.getLong("region_id"),
                rs.getFloat("longitude"),
                rs.getFloat("lattitude"),
                rs.getString("date1"),
                rs.getString("time1"));
    }
}
