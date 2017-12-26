package com.my.system.Dao;

import com.my.system.Bean.UserLogin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginMapper {
    @Select("select * from userlogin where userName = #{username} and password = #{password}")
    public UserLogin selectByMap(@Param("username") String username, @Param("password") String password);

    @Select("select * from userlogin where userName = #{username}")
    public UserLogin findByUsername(String username);
}
