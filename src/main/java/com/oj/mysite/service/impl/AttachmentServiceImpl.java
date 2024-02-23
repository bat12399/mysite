package com.oj.mysite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oj.mysite.mapper.AttachmentMapper;
import com.oj.mysite.model.Attachment;
import com.oj.mysite.service.AttachmentService;
import org.springframework.stereotype.Service;

@Service
public class AttachmentServiceImpl extends ServiceImpl<AttachmentMapper, Attachment> implements AttachmentService {
}
