-- justdoit.`user` definition
CREATE TABLE `user`
(
    `id`                int          NOT NULL AUTO_INCREMENT COMMENT '' 用户ID，自增主键 '',
    `username`          varchar(50)  NOT NULL COMMENT '' 用户名，唯一且不能为空 '',
    `password`          varchar(100) NOT NULL COMMENT '' 密码，不能为空 '',
    `email`             varchar(100) NOT NULL COMMENT '' 邮箱地址，不能为空 '',
    `enabled`           tinyint(1)   NOT NULL COMMENT '' 标识用户是否启用的布尔字段 '',
    `registration_date` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '' 注册日期，默认为当前时间 '',
    `last_login`        timestamp    NOT NULL DEFAULT ''2000 - 01 - 01 00:00:00 '' COMMENT '' 最后登录时间 '',
    `avatar_url`        varchar(255)          DEFAULT NULL COMMENT '' 头像链接 '',
    `bio`               text COMMENT '' 个人简介 '',
    `address`           varchar(100)          DEFAULT NULL COMMENT '' 地址信息 '',
    `phone_number`      varchar(20)           DEFAULT NULL COMMENT '' 电话号码 '',
    `role`              varchar(20)  NOT NULL COMMENT '' 角色，这里假设一个用户只有一个角色，如果需要多个角色，可以考虑另外建立角色表并创建用户角色关联表 '',
    PRIMARY KEY (`id`),
    UNIQUE KEY `username` (`username`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 9
  DEFAULT CHARSET = ujis COMMENT = ''用户表'';

CREATE TABLE roles
(
    role_id     INT PRIMARY KEY COMMENT '' 角色ID '',
    role_name   VARCHAR(50) COMMENT '' 角色名称 '',
    description TEXT COMMENT '' 角色描述 ''
);

CREATE TABLE permissions
(
    permission_id   INT PRIMARY KEY COMMENT '' 权限ID '',
    permission_name VARCHAR(50) COMMENT '' 权限名称 '',
    description     TEXT COMMENT '' 权限描述 ''
);

CREATE TABLE resources
(
    resource_id   INT PRIMARY KEY COMMENT '' 资源ID '',
    resource_name VARCHAR(50) COMMENT '' 资源名称 '',
    description   TEXT COMMENT '' 资源描述 ''
);

CREATE TABLE user_role
(
    user_id INT,
    role_id INT,
    FOREIGN KEY (user_id) REFERENCES user (id),
    FOREIGN KEY (role_id) REFERENCES roles (role_id),
    PRIMARY KEY (user_id, role_id)
);

CREATE TABLE role_permissions
(
    role_id       INT,
    permission_id INT,
    FOREIGN KEY (role_id) REFERENCES roles (role_id),
    FOREIGN KEY (permission_id) REFERENCES permissions (permission_id),
    PRIMARY KEY (role_id, permission_id)
);

CREATE TABLE permission_resources
(
    permission_id INT,
    resource_id   INT,
    FOREIGN KEY (permission_id) REFERENCES permissions (permission_id),
    FOREIGN KEY (resource_id) REFERENCES resources (resource_id),
    PRIMARY KEY (permission_id, resource_id)
);

CREATE TABLE EntityFile (
    file_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '文件ID',
    file_name VARCHAR(255) NOT NULL COMMENT '文件名',
    file_path VARCHAR(255) NOT NULL COMMENT '文件路径',
    file_size INT NOT NULL COMMENT '文件大小（字节）',
    upload_time DATETIME NOT NULL COMMENT '上传时间',
    owner_id INT NOT NULL COMMENT '所有者ID',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT = '实体文件表，用于存储文件信息';