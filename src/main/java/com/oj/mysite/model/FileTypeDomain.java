package com.oj.mysite.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("file_types") // 指定对应的数据库表名
public class FileTypeDomain {
    private Long id;
    private String typeName;
}
