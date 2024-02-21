package com.oj.mysite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oj.mysite.dao.UserDao;
import com.oj.mysite.model.UserDomain;
import com.oj.mysite.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserDomain> implements UserService {
}
