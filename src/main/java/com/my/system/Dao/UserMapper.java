package com.my.system.Dao;

import com.my.system.Bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    @Select("select * from user where Id = #{id}")
    public User getUserById(Integer id);

    @Select("select * from user")
    public List<User> getUserList();

    @Insert("insert into user(username,password,age) values(#{username},#{password},#{age})")
    public int add(User user);

    @Update("update user set username = #{user.username}, password = #{user.password}, age = #{user.age} where Id = #{id}")
    public int update(@Param("id") Integer id, @Param("user") User user);

    @Delete("delete from user where Id = #{id}")
    public int delete(Integer id);

}
