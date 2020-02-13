package com.springcloudstudy.client;

import com.springcloudstudy.stream.MySource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class StreamProducer {

    @Autowired
    @Qualifier(MySource.OUTPUT1)
    private MessageChannel outputChannel;

    @GetMapping("/produceMsg")
    public void send(){
        outputChannel.send(MessageBuilder.withPayload("MySource===helloworld").build());
        log.info("生产消息：MySource===helloworld");

    }



}
