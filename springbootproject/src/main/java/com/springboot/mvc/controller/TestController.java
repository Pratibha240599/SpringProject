package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {
        int a = 1;
        int b = 100;
        int c = 2;
        int d = 1;
        return "this is just testing sum of a, b, c and d is " + (a+b+c+d);
    }
}
