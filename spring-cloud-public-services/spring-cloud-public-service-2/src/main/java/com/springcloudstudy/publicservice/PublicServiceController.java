package com.springcloudstudy.publicservice;

import com.springcloudstudy.fegin.BasePersonService;
import com.springcloudstudy.fegin.StreamMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
public class PublicServiceController {
    @Autowired
    public BasePersonService basePersonService;
    @Autowired
    public StreamMsgService streamMsgService;

    @GetMapping("/createPerson")
    public String createPerson(@RequestParam String name) throws InterruptedException {
        Random random = new Random();
        if(random.nextBoolean()){
            TimeUnit.SECONDS.sleep(1000);
        }
        return "service(2)" + basePersonService.createPerson(name);
    }

    @GetMapping("/sendMsg")
    public String send() throws InterruptedException {
        streamMsgService.send();
        return "成功执行消息发送";
    }

}
