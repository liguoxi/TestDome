package com.testssh.service.Impl;

import com.testssh.dao.NoticeDao;
import com.testssh.jopo.Notice;
import com.testssh.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeDao noticeDao;
    @Override
    public List<Notice> findAll() {
        return noticeDao.findAll();
    }
}
