package com.my.system.Mapper;

import com.my.system.Bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where Id = #{id}")
    public User getUserById(Integer id);

    @Select("select * from user")
    public List<User> getUserList();

    @Select("insert into user(username,password,age) values(#{username},#{password},#{age}")
    public int add(User user);

    @Update("update user set username = #{user.username}, password = #{user.password}, age = #{user.age} where Id = #{id}")
    public int update(@Param("id") Integer id, @Param("user") User user);

    @Delete("delete from user where Id = #{id}")
    public int delete(Integer id);

}
