package com.my.system.Dao;

import com.my.system.Bean.UserLogin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginMapper {
    @Select("select * from userlogin where userName = #{username}, password = #{password}")
    public UserLogin selectByMap(String username, String password);

    @Select("select * from userlogin where userName = #{username}")
    public UserLogin findByUsername(String username);
}
