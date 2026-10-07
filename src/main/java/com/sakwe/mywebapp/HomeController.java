package com.sakwe.mywebapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String home()
    {
        System.out.println("Hi");
        return "home.jsp";
    }
}
