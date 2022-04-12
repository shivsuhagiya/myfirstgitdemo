package com.myfirstgit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

    @GetMapping("/mywelcome-message")
    public String welcomeMessage(){
        return "my first welcome message, my first commit successfully completed.";
    }
}
