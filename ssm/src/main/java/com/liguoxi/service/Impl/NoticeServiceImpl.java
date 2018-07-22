package com.liguoxi.service.Impl;

import com.liguoxi.mapper.Notice2Mapper;
import com.liguoxi.pojo.Notice;
import com.liguoxi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private Notice2Mapper noticeMapper;
    @Override
    public List<Notice> queryAllNotice() {

        return noticeMapper.queryAllNotice();
    }

    @Override
    public Long count() {
        return noticeMapper.count();
    }

    @Override
    public Map<String,Object> findByPage(Long page, Long rows) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Notice> byPage = noticeMapper.findByPage((page - 1) * rows, rows);
        Long count = count();
        map.put("total", count);
        map.put("rows", byPage);
        return map;
    }
}
