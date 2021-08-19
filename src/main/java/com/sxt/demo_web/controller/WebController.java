package com.sxt.demo_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@RequestMapping("/test")
public class WebController implements WebMvcConfigurer {
    @RequestMapping("/hi")
    public String test(){
        return "main";
    }
}
