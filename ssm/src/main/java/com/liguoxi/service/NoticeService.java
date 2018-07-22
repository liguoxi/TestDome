package com.liguoxi.service;

import com.liguoxi.pojo.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface NoticeService {
    List<Notice> queryAllNotice();
    Long count();
    Map<String,Object> findByPage(Long page, Long rows);
}
