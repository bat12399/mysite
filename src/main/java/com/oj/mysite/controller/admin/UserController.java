package com.oj.mysite.controller.admin;

import com.oj.mysite.model.User;
import com.oj.mysite.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getList")
    public List<User> getList(){
        List<User> userList = userService.list();
        return userList;
    }

    @PostMapping("/add")
    public String add(User user){
        boolean result = userService.saveUserDetails(user);
        if (result){
            return "success";
        }else {
            return "fail";
        }
    }
}
