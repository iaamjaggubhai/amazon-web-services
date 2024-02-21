package com.miraclesoft.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/aws")
public class AWSController {

    @GetMapping(path = "/welcome")
    public String message(){
        return "Welcome";
    }
}
