package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TipController {


    @Autowired
    TipRepository tipRepo;

    //GetMapping for homepage
    @GetMapping("/")
    public String getStartpage() {

        return "home";
    }

    @GetMapping("/ChooseCategory")
    public String getCategory(){

        return "ChooseCategory";
    }

    @GetMapping("/ObjectForm")
    public String getObjectForm(){

        return "ObjectForm";
    }

    @GetMapping("/PersonForm")
    public String getPersonForm(){

        return "PersonForm";
    }

    @GetMapping("/ActivityForm")
    public String getActivityForm(){

        return "ActivityForm";
    }

    @PostMapping("/send")
    public String sendData(@RequestParam String crime){
        System.out.println(crime);
        tipRepo.addTip(crime);
        return"home";
    }


}
