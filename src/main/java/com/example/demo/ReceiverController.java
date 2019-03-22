package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


public class ReceiverController {

    @Autowired
    TipRepository tipRepository;

    @GetMapping("/")
    public String getTipReceiver(){
        return "TipReceiver";
    }

    @PostMapping("/")
    public String postTipReceiver(){

    return "TipReceiver";
    }
}
