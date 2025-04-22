package com.StudentData.TechWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.StudentData.TechWork.Entity.Userdata;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.StudentData.TechWork.Service.Userdataservice;

@Controller
public class FormCntrl {

    @Autowired
    private Userdataservice uds;

    @GetMapping("/")
    public String showform(Model model) {
        model.addAttribute("userData", new Userdata());
        return "form";
    }

    @PostMapping("/submit")
    public String submit(Userdata usd) {
        uds.saveUserData(usd);
        return "redirect:/";
    }

}
