package com.my.system.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping(value = "/")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("login");
        System.out.println("返回登录视图");
        return mv;
    }
}
