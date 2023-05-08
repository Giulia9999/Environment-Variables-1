package com.example.environmentvariables01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {
    @Autowired
    Environment environment;

    @GetMapping
    public String greet(){
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return devName + ": " + authCode;
    }
}
