package com.liguoxi.controller;

import com.liguoxi.pojo.Notice;
import com.liguoxi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @ResponseBody
    @RequestMapping("/finall")
    public List<Notice> queryAllNotice(){
       return noticeService.queryAllNotice();
    }

    @ResponseBody
    @RequestMapping("/findByPage")
    Map<String,Object> findByPage(Long page, Long rows) {
        return noticeService.findByPage(page, rows);
    }

    @RequestMapping("/test")
    public String test() {
        return "/html/notice.html";
    }
}
