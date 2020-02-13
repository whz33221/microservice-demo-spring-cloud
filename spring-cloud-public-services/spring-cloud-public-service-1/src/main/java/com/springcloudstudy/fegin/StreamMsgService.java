package com.springcloudstudy.fegin;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("rabbitmq-producer")
public interface StreamMsgService {

     @GetMapping("/produceMsg")
     void send();

}
