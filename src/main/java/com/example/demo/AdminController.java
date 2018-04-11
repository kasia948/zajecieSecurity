package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @ResponseBody
    @GetMapping("/admin")
    public String login(){
        return "admin";
    }



}
