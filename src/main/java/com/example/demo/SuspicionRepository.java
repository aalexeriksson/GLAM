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
public class SuspicionRepository {

    @Autowired
    private DataSource dataSource;

    public List<Suspicions> getAllSuspicions() {

        List<Suspicions> suspicions = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM SUSPICION")) {
            while (rs.next()) {
                suspicions.add(rsSuspicions(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return suspicions;

    }

    public Suspicions rsSuspicions(ResultSet rs) throws SQLException {
        return new Suspicions(rs.getLong("id"),
                rs.getString("category_of_suspicion"),
                rs.getString("type_of_suspicion"),
                rs.getString("subtype_of_suspicion"),
                rs.getString("details"),
                rs.getString("media"));
    }
}
