package com.winterchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thyme")
public class ThymeleafController {

    @RequestMapping("/hello")
    public String thyme() {
        return "thyme";
    }
}
