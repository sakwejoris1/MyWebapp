package com.sakwe.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(HttpServletRequest req)
    {
        ModelAndView mv = new ModelAndView();

        Alient alient = new Alient();
        alient.setAid(Integer.parseInt(req.getParameter("aid")));
        alient.setAname(req.getParameter("aname"));
        alient.setLang(req.getParameter("lang"));

        mv.addObject("obj",alient);

        mv.setViewName("home");
        return mv;
    }
}
