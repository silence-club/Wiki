package com.xuan.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController
 * @description: TODO
 * @author: Lenovo
 * @date: 2023/11/21
 **/
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!!!";
    }
}
