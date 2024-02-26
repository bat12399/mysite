package com.oj.mysite.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oj.mysite.model.User;

public interface UserService extends IService<User> {
    boolean saveUserDetails(User user);
}
