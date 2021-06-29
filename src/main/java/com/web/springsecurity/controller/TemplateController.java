package com.web.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    @RequestMapping("login")
    public String getLogin() {
        return "login";
    }
}
