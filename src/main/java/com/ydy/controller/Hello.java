package com.ydy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@RestController
public class Hello {
    @GetMapping("/")
    public String sayHello(){
        return "hello spring boot";
    }
}
