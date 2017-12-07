package com.my.system.Controller;

import com.my.system.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @Autowired
//    private UserService userService;

    @RequestMapping(value = "/hello")
    public String saying(){
        return "Hello, MoYang!";
    }

    @RequestMapping(value = "getUsers")
    public String getUsers(){
        return null;
    }
}
