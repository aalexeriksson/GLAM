package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoliceLoginRepository {

    @Autowired
    private DataSource dataSource;

    private PoliceLogin rsPoliceLogin(ResultSet rs) throws SQLException {
        return new PoliceLogin (rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("username"),
                rs.getString("password"));
    }


    public PoliceLogin login(String username){
        PoliceLogin user= null;

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM POLICE_LOGIN WHERE USERNAME = ?")) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user=rsPoliceLogin(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }


    public void savePolice(PoliceLogin suspicion) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO POLICE_LOGIN (FIRST_NAME, LAST_NAME, USERNAME, PASSWORD) VALUES(?,?,?,?)")) {
            ps.setString(1, suspicion.getFirst_name());
            ps.setString(2, suspicion.getLast_name());
            ps.setString(3, suspicion.getUsername());
            ps.setString(4, suspicion.getPassword());


            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //This query is not used for anything ???
//    public List<PoliceLogin> getAllPoliceLogins() {
//        List<PoliceLogin> policeLogin = new ArrayList<>();
//        try (Connection conn = dataSource.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM POLICE_LOGIN")) {
//            while (rs.next()) {
//                policeLogin.add(rsPoliceLogin(rs));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return policeLogin;
//    }




}
