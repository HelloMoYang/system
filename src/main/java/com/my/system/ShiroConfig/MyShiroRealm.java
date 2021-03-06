package com.my.system.ShiroConfig;

import com.my.system.Bean.Role;
import com.my.system.Bean.UserLogin;
import com.my.system.Service.RoleService;
import com.my.system.Service.UserLoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm{

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private RoleService roleService;
    /*
    *   获取授权信息
    * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("进行权限认证...");
        //   UserLogin token = (UserLogin) SecurityUtils.getSubject().getPrincipal();
        //   String currentUsername = super,getAvailablePrincipal(principalCollection);
        UserLogin userLogin = (UserLogin) principalCollection.getPrimaryPrincipal();
        Role role = null;
        try {
            role = roleService.findById(userLogin.getRole());
        }catch(Exception e){
            e.printStackTrace();
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roles = new HashSet<String>();
        if(role != null){
            roles.add(role.getRoleName());
            info.setRoles(roles);
        }
        return info;
    }

    /*
    *  获取身份验证相关信息
    * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) {
        //  token是从页面提交的进行认证的令牌信息
        System.out.println("进行身份认证...");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Map<String,String> map = new HashMap<>();
        map.put("username", token.getUsername());
        map.put("password", String.valueOf(token.getPassword()));
        UserLogin userLogin = userLoginService.selectByMap(map);
        if(userLogin == null){
            throw new AccountException();
        } else {
            //  身份验证通过，从数据库中取出身份信息    getName()返回一个唯一的Realm名字
            return new SimpleAuthenticationInfo(userLogin,userLogin.getPassword(),getName());
        }
    }
}
