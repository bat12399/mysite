package com.oj.mysite.controller.admin;

import com.oj.mysite.model.UserDomain;
import com.oj.mysite.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/admin/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getList")
    public List<UserDomain> getList(){
        List<UserDomain> userList = userService.list();
        return userList;
    }
}
