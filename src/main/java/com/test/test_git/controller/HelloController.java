package com.test.test_git.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("test02");
        return "Hello ";
    }

    @RequestMapping("/getName")
    public String getName(){
        return "test";
    }
}
