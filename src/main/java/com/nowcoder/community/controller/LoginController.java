package com.nowcoder.community.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(path = "/register")
    public String getRegisterPage(){
        return "/site/register";
    }
}
