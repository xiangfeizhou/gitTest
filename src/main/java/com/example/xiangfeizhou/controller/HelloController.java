package com.example.xiangfeizhou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/")
public class HelloController {
    @GetMapping("hello.do")
    public String hello(){
        return "hello git";
    }
}
