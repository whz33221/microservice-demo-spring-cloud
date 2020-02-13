package com.springcloudstudy.fegin;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("base-application")
public interface BasePersonService {

    @GetMapping("/person/createPerson")
    String createPerson(@RequestParam("name") String name);

}
