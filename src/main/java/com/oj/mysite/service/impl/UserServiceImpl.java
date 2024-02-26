package com.oj.mysite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oj.mysite.config.DBUserDetailsManager;
import com.oj.mysite.mapper.UserMapper;
import com.oj.mysite.model.User;
import com.oj.mysite.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private DBUserDetailsManager dbUserDetailsManager;

    @Override
    public boolean saveUserDetails(User user) {


        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withDefaultPasswordEncoder()
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
        dbUserDetailsManager.createUser(userDetails);

        return false;
    }
}
