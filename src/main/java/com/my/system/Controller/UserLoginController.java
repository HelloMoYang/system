package com.my.system.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class UserLoginController {

    @GetMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        currentUser.login(token);
        return "/loginSuccess";
    }
}
