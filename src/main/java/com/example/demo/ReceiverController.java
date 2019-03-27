package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ReceiverController {

    @Autowired
    PoliceLoginRepository policeRepository;

    @Autowired
    SuspicionRepository suspicionRepository;

    @GetMapping("/AdminLogin")
    public String login(HttpSession session) {

        if (session.getAttribute("currentUser") == null)
            return "AdminLogin";
        else
           return "redirect:/PoliceProfile";

    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/police")
    public String getTipReceiver(){
        return "PoliceProfile";
    }

//    @PostMapping("/police")
//    public String postTipReceiver(){}

    @GetMapping("/PoliceProfile")
    public String getTipReceiver(HttpSession session, Model model){

            List<Suspicions> suspicionsList = suspicionRepository.getAllSuspicions();
            model.addAttribute("suspicions", suspicionsList);
            return "PoliceProfile";
    }
    @GetMapping("/popup")
    public String getTver(){
        return "popup";
    }



}
