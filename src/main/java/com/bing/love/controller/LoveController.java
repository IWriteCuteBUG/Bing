package com.bing.love.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoveController {

    @RequestMapping("love/bing")
    public String love() {
        return "饼饼我爱你";
    }
}
