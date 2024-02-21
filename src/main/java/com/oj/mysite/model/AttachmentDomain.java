package com.oj.mysite.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("attachments")
public class AttachmentDomain {
    private Long id; // 附件ID，自增主键
    private String fileName; // 附件名称
    private String fileExtension; // 附件后缀
    private Integer fileTypeId; // 文件类型外键
    private Integer fileSize; // 附件大小
    private Long relatedId; // 关联数据的ID
    private String relatedTable; // 关联数据的表名
    private LocalDateTime uploadTime; // 上传时间
    private String filePath; // 文件在服务器上的路径
}
