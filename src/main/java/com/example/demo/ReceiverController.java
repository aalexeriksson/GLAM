package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


public class ReceiverController {

    @Autowired
    TipRepository tipRepository;

    @Autowired
    PoliceLoginRepository policeRepository;

    @GetMapping("/TipReceiverHome")
    public String login(HttpSession session) {

        if (session.getAttribute("currentUser") == null)
            return "TipReceiverHome";
        else
            return "redirect:/ReceiverLogin";
    }

    @PostMapping("/PoliceProfile")
    public String loginPost(Model model, HttpSession session, @RequestParam String userName, @RequestParam String password) {

        List<PoliceLogin> policeList = policeRepository.getAllPoliceLogins();

        for (int i = 0; i < policeList.size(); i++) {
            if (userName.equals(policeList.get(i).getUsername()) && password.equals(policeList.get(i).getPassword())) {
                session.setAttribute("currentUser", policeList.get(i));
                return "redirect:/PoliceProfile";
            }
        }
        return "/TipReceiverHome";
    }




}
