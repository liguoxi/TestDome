package com.testssh.controller;

import com.testssh.jopo.Notice;
import com.testssh.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @RequestMapping("/test")
    @ResponseBody
    public List<Notice> test(){
        return noticeService.findAll();
    }
}
