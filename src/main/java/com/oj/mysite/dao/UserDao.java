package com.oj.mysite.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oj.mysite.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserDomain>{
}
