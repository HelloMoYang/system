package com.my.system.Controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//public class AdminController {
//    @RequiresRoles("admin")
//    @GetMapping("/admin/showCourse")
//    public ModelAndView showCourse(){
//        ModelAndView mv = new ModelAndView("admin/showCourse");
//        System.out.println("showCourse视图");
//        return mv;
//    }
//}
