package com.my.system.Controller;

import com.my.system.Bean.UserLogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class UserLoginController {

    @PostMapping(value = "/userLogin")
    public ModelAndView login(@RequestParam("username") String username,
                        @RequestParam("password") String password, HttpSession session){
        //  获取Subject单例对象
        Subject currentUser = SecurityUtils.getSubject();
        //  使用用户的登录信息创建用户令牌
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            currentUser.login(token);
            UserLogin userLogin = (UserLogin) currentUser.getPrincipal();
            session.setAttribute("userLogin",userLogin);
            if (currentUser.hasRole("admin")){
                ModelAndView mv = new ModelAndView("admin/admin");
                return mv;
            }
            ModelAndView mv = new ModelAndView("loginSuccess");
            return mv;
        }catch(AuthenticationException e){
            ModelAndView mv = new ModelAndView("error");
            mv.addObject("msg","用户名或密码不正确！");
            return mv;
        }
    }
}
