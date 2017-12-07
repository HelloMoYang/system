package com.my.system.Service;

import com.my.system.Bean.User;

import java.util.List;

public interface UserService {
    public User getUserById(Integer id);
    public List<User> getUserList();
    public int add(User user);
    public int update(Integer id, User user);
    public int delete(Integer id);
}
