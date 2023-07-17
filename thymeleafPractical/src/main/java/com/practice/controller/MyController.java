package com.practice.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value =  "/about", method = RequestMethod.GET)
    public String about(Model model)
    {
        System.out.println("Inside about handler ...");

        //putting data in model
        model.addAttribute("name", "Pratibha Sharma");
        model.addAttribute("currentDate", new Date().toLocaleString());
        return "about";
    }

    @GetMapping("/example-loop")
    public String iterateHandler(Model m) {

        List<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Laxmi");
        list.add("Karan");
        list.add("John");

        m.addAttribute("list1", list);

        return "iterate";
    }
}