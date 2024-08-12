package com.firstbasicapi.firstapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstapiController {

    @GetMapping(value = "/firstapi")   //we dont need to write value = 
    public String firstapihello(){
        return "Hello this is my first API----------------------------------------------  !!";
    }

    @GetMapping(value = "/firstapione")
    public String apihellonew(){
        return "Hello this is my first API similar to the previous one  !!";
    }
}
