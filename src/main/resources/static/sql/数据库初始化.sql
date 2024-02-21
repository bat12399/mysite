-- justdoit.`user` definition

CREATE TABLE `user` (
                        `id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID，自增主键',
                        `username` varchar(50) NOT NULL COMMENT '用户名，唯一且不能为空',
                        `password` varchar(100) NOT NULL COMMENT '密码，不能为空',
                        `email` varchar(100) NOT NULL COMMENT '邮箱地址，不能为空',
                        `enabled` tinyint(1) NOT NULL COMMENT '标识用户是否启用的布尔字段',
                        `registration_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册日期，默认为当前时间',
                        `last_login` timestamp NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '最后登录时间',
                        `avatar_url` varchar(255) DEFAULT NULL COMMENT '头像链接',
                        `bio` text COMMENT '个人简介',
                        `address` varchar(100) DEFAULT NULL COMMENT '地址信息',
                        `phone_number` varchar(20) DEFAULT NULL COMMENT '电话号码',
                        `role` varchar(20) NOT NULL COMMENT '角色，这里假设一个用户只有一个角色，如果需要多个角色，可以考虑另外建立角色表并创建用户角色关联表',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=ujis COMMENT='用户表';

CREATE TABLE attachments (
                             id INT NOT NULL AUTO_INCREMENT,  -- 附件ID，自增主键
                             file_name VARCHAR(255) NOT NULL COMMENT '附件名称',  -- 附件名称
                             file_extension VARCHAR(50) COMMENT '附件后缀',  -- 附件后缀
                             file_type_id INT COMMENT '文件类型外键',  -- 文件类型外键
                             file_size INT COMMENT '附件大小',  -- 附件大小
                             related_id INT NOT NULL COMMENT '关联数据的ID',  -- 关联数据的ID
                             related_table VARCHAR(50) NOT NULL COMMENT '关联数据的表名', -- 关联数据的表名
                             upload_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '上传时间',  -- 上传时间
                             file_path VARCHAR(255) NOT NULL COMMENT '文件在服务器上的路径',   -- 文件在服务器上的路径
                             PRIMARY KEY (id),
                             INDEX (related_id, related_table),  -- 创建索引以加快关联数据的查询
                             FOREIGN KEY (file_type_id) REFERENCES file_types(id)  -- 外键关联文件类型表
) COMMENT = '附件表，用于存储附件信息';

CREATE TABLE file_types (
                            id INT NOT NULL AUTO_INCREMENT,
                            type_name VARCHAR(100) NOT NULL COMMENT '文件类型名称',   -- 文件类型名称，如“图片”、“文档”等
                            PRIMARY KEY (id)
) COMMENT = '文件类型表，用于存储不同类型的文件信息';