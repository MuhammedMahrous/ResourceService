package com.mahrous.resourceservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiCont {
    @GetMapping("/hello")
    @PreAuthorize("hasRole('manage-account')")
    public String hi(){
        return "hello";
    }

    @GetMapping("/helloNo")
    @PreAuthorize("hasRole('manage-accounta')")
    public String hi2(){
        return "hellono";
    }
}
