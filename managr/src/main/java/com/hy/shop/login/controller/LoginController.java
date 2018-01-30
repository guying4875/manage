package com.hy.shop.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhjx on 2018/1/28.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login/login";
    }
}
