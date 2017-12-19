package com.my.system.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = "/view")
    public String hello(Model model){
        model.addAttribute("name","Dear");
        return "/index";
    }
}
