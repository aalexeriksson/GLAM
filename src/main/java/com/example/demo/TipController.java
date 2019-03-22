package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String getCategory() {

        return "ChooseCategory";
    }

    @GetMapping("/ObjectForm")
    public String getObjectForm(Model model) {
        model.addAttribute("ReportedSuspicions", new ReportedSuspicions());
        return "ObjectForm";
    }

    @GetMapping("/PersonForm")
    public String getPersonForm(Model model) {
        model.addAttribute("ReportedSuspicions", new ReportedSuspicions());
        return "PersonForm";
    }

    @GetMapping("/ActivityForm")
    public String getActivityForm(Model model) {

        model.addAttribute("ReportedSuspicions", new ReportedSuspicions());

        return "ActivityForm";
    }


    @PostMapping("/form")
    public String submitPersonform(@ModelAttribute ReportedSuspicions reportedSuspicions) {
    tipRepo.addTip(reportedSuspicions);
        return "home";
    }

    //receivercontroller

    @GetMapping("/receiver")
    public String getTipReceiver(Model model) {
        List<ReportedSuspicions> tipsList = tipRepo.getAllTips();
        model.addAttribute("tipsList", tipsList);
        for(ReportedSuspicions reported: tipsList){
            System.out.println(reported.getCrime()+reported.getTextbox()+reported.getLocation()+reported.getLatitude()+reported.getLongitude());

        }
        return "TipReceiver";
    }

    @PostMapping("/receiver")
    public String postTipReceiver(){

        return "TipReceiver";
    }



}
