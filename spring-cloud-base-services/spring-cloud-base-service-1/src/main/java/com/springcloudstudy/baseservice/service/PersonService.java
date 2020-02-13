package com.springcloudstudy.baseservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@Slf4j
public class PersonService {

    public String createPerson(String name){
        log.info("创建person成功");
        return "创建成功";
    }
}
