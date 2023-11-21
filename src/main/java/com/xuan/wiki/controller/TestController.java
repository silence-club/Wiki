package com.xuan.wiki.controller;

import com.xuan.wiki.domain.Test;
import com.xuan.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: TestController
 * @description: TODO
 * @author: Lenovo
 * @date: 2023/11/21
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!!!";
    }

    @GetMapping("test/list")
    public List<Test> list(){
        return testService.list();
    }
}
