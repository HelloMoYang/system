package com.my.system.Config;

import com.my.system.Bean.UserLogin;
import com.my.system.Service.UserLoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MyShiroRealm extends AuthorizingRealm{

    private static final String User_Name = "admin";
    private static final String PassWord = "123";

    @Autowired
    private UserLoginService userLoginService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Map map = new HashMap();
        map.put("username", token.getUsername());
        map.put("password", token.getPassword());
        UserLogin userLogin = userLoginService.selectByMap(map);
        if(userLogin == null){
            throw new AccountException("用户名或密码不正确！");
        } else {
            return new SimpleAuthenticationInfo(userLogin,userLogin.getPassword(),getName());
        }
    }
}
