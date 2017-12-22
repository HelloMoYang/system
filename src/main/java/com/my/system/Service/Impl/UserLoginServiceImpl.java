package com.my.system.Service.Impl;

import com.my.system.Bean.UserLogin;
import com.my.system.Dao.UserLoginMapper;
import com.my.system.Service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public UserLogin selectByMap(Map map) {
        String username = (String) map.get("username");
        String password = (String) map.get("passowrd");
        return userLoginMapper.selectByMap(username,password);
    }

    @Override
    public UserLogin findByUsername(String username) {
        return userLoginMapper.findByUsername(username);
    }
}
