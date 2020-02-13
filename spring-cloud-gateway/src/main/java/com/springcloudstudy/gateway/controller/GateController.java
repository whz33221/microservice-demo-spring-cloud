package com.springcloudstudy.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateController {
    @GetMapping("/error")
    public String error(){
        return "熔断错误";
    }

}
