package com.example.xiangfeizhou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @GetMapping("email.do")
    public String email(){
        return "邮箱的开发";
    }
}
