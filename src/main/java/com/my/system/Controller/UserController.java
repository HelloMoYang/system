package com.my.system.Controller;

import com.my.system.Bean.User;
import com.my.system.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello")
    public String saying(){
        return "Hello, MoYang!";
    }

    @RequestMapping(value = "/getUserList")
    public Map<String, Object> getUserList(){
        List<User> userList = userService.getUserList();
        Map<String,Object> param = new HashMap<String, Object>();
        param.put("total", userList.size());
        param.put("rows", userList);
        return param;
    }

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        if(user == null){
            throw new RuntimeException("查询错误，没有此用户！");
        }
        return user;
    }

    @PostMapping(value = "/addUser")
    public void addUser(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("age") Integer age){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        try{
            userService.add(user);
        }catch (Exception e) {
            throw new RuntimeException("添加用户发生错误！");
        }
    }

    @PutMapping(value="/updateUser/{id}")
    public void updateUser(@PathVariable("id") Integer id,
                           @RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("age") Integer age){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        try {
            userService.update(id, user);
        } catch(Exception e) {
            throw new RuntimeException("用户更新发生错误！");
        }
    }

    @DeleteMapping(value="/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        try {
            userService.delete(id);
        }catch(Exception e){
            throw new RuntimeException("用户删除发生错误！");
        }
    }
}
