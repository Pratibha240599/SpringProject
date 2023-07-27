package com.practice.controller;

import java.time.LocalDateTime;
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

    //handle for conditional statements
    @GetMapping("/condition")
    public String conditionHandler(Model m)
    {
        System.out.println("conditional handler executed...");
        m.addAttribute("isActive", true);
        m.addAttribute("gender", "F");

        List<Integer> list2 = new ArrayList<>();
        list2.add(233);
        list2.add(43);
        list2.add(53);
        list2.add(6456);
        list2.add(64);

        m.addAttribute("mylist", list2);
        return "condition";
    }

    //handler for including fragments
    @GetMapping("/service")
    public String servicesHandler(Model m)
    {
        m.addAttribute("title", "I like to eat samosa");
        m.addAttribute("subtitle", LocalDateTime.now().toString());
        return "service";
    }

    //for new about
    @GetMapping("/newabout")
    public String newAbout()
    {
        return "aboutnew";
    }

    //for contact
    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }
}