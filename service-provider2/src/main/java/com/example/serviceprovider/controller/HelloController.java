package com.example.serviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: xujin
 **/
@RestController
public class HelloController {

    @GetMapping("/customFilter")
    public String customFilter(@RequestParam String name, HttpServletRequest request) {
        return "customFilter, " + name + "!"+request.getServerPort();
    }
}
