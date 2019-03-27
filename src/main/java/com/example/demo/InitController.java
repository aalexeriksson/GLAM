package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @Autowired
    private PoliceLoginRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @GetMapping("/init")
    public String init(){
        PoliceLogin user = userRepository.login("AE");
        if (user == null) {
            user = new PoliceLogin("Alöex", "Eriksson", "AE", "1234");

            user.setPassword(encoder.encode("1234"));
            userRepository.savePolice(user);
        }

        return "login";
    }
}