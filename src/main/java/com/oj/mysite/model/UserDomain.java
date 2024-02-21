package com.oj.mysite.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("user")
public class UserDomain {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private boolean enabled;
    private Timestamp registrationDate;
    private Timestamp lastLogin;
    private String avatarUrl;
    private String bio;
    private String address;
    private String phoneNumber;
    private String role;
    private String nickname;

}
