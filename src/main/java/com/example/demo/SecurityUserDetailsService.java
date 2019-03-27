package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserDetailsService implements UserDetailsService {


    //CHANGE FROM JPA TO JDBC
    @Autowired
    private PoliceLoginRepository loginRepo;
//ÄNDRA "USER" TILL PoliceLogin???s
    @Override
    public UserDetails loadUserByUsername(String username) {
        PoliceLogin user = loginRepo.login(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new SecurityUserPrincipal(user); // new Class that has to be added.
    }
}
