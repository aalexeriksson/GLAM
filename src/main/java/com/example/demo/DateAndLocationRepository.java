package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
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
                rs.getFloat("longitude"),
                rs.getFloat("lattitude"),
                rs.getString("date1"),
                rs.getString("time1"));
    }

    public void saveSuspicion(DateAndLocation dateAndLocation) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, LONGITUDE, LATTITUDE, DATE1, TIME1) values (?,?,?,?,?)")) {
            ps.setLong(1, dateAndLocation.getSupicion_id());
            ps.setFloat(2, dateAndLocation.getLattitude());
            ps.setFloat(3, dateAndLocation.getLattitude());
            ps.setString(4, dateAndLocation.getDate1());
            ps.setString(5, dateAndLocation.getTime1());






            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
