package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Cześć!";
    }

    @GetMapping("/koduj")
    @ResponseBody
    public String koduj (@RequestParam String text){
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        String encode=encoder.encode(text);
        return encode;
    }


}
