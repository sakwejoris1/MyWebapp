package com.sakwe.mywebapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(HttpServletRequest req)
    {
        String name =  req.getParameter("name");
         System.out.println("Hi " + name);
         req.setAttribute("name", name);
        return "home";
    }
}
