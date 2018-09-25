package com.ethan.pagehelper.controller;

import com.ethan.pagehelper.service.HelpTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/helpTopic")
public class HelpTopicController {

    @Autowired
    private HelpTopicService helpTopicService;

    @GetMapping("/list")
    public Map<String, Object> list(int pageNo, int pageSize){
        return helpTopicService.listHelpTopics(pageNo, pageSize);
    }
}
