package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TipController {


    @Autowired
    TipRepository tipRepo;

    String cloud = "dfyxx5zdo";

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


    @GetMapping("/receiver")
    public String getTipReceiver(Model model) {
        List<ReportedSuspicions> tipsList = tipRepo.getAllTips();
        model.addAttribute("tipsList", tipsList);
        return "TipReceiver";
    }

//    @PostMapping("/receiver")
//    public String postTipReceiver(){
//
//        return "TipReceiver";
//    }


    @PostMapping("/form")
    public String submitPersonform(@ModelAttribute ReportedSuspicions reportedSuspicions, @RequestParam(value = "picturecloudinary", required = false) String picture) {
        reportedSuspicions.setImage("https://res.cloudinary.com/" + cloud + "/" + picture);

        tipRepo.addTip(reportedSuspicions);

        return "home";
    }


    @DeleteMapping("/receiver/{id}")
    public void delete(@PathVariable long id) {
        tipRepo.deleteTip(id);
    }
    @GetMapping("/receiver/{id}")
    public String getById(@PathVariable long id) {
        tipRepo.getAllTips();
    return "TipReceiver";}

    @GetMapping("/login")
    public String login(){

        return "ReceiverLogin";
    }

}
