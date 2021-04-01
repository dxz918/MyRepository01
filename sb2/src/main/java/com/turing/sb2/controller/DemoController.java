package com.turing.sb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class DemoController {

    @GetMapping("/show")
    public String show(Date time) {
        System.out.print(time);
        return "index";
    }
}
