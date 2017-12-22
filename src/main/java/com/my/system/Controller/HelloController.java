package com.my.system.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
