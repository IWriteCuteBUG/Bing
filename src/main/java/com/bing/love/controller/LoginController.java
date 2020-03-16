package com.bing.love.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/admin/auth/login")
    public String login() {
        return null;
    }
}
