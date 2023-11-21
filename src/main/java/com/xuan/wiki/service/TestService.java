package com.xuan.wiki.service;

import com.xuan.wiki.domain.Test;
import com.xuan.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: TestService
 * @description: TODO
 * @author: Lenovo
 * @date: 2023/11/21
 **/
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }

}
