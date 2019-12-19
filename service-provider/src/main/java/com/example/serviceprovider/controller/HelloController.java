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

    @GetMapping(value = "/v1")
    public String v1() {
        return "v1";
    }

    @GetMapping(value = "/v2")
    public String v2() {
        return "v2";
    }

    @GetMapping("/rateLimit")
    public String hello() {
        return "Hello, spring cloud Gateway";
    }
}
