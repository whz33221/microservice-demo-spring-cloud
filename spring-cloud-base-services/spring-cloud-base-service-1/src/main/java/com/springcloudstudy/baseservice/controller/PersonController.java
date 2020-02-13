package com.springcloudstudy.baseservice.controller;

import com.springcloudstudy.baseservice.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/createPerson")
    public String createPerson(@RequestParam("name") String name){
        log.info("person基础服务被成功调用！");
        return personService.createPerson(name);
    }

}
