package com.oj.mysite.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User {

    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 是否启用
     */
    private boolean enabled;

    /**
     * 注册日期
     */
    private Timestamp registrationDate;

    /**
     * 最后登录日期
     */
    private Timestamp lastLogin;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 个人简介
     */
    private String bio;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 角色
     */
    private String role;

    /**
     * 昵称
     */
    private String nickname;

}
