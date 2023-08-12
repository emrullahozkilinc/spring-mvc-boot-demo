package com.emr.springmvcbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

    @RequestMapping("/")
    public String getDemoPage() {
        return "index";
    }
}
