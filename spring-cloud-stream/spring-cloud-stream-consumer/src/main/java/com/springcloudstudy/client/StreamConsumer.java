package com.springcloudstudy.client;

import com.springcloudstudy.stream.MySink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class StreamConsumer {
    @Autowired
    @Qualifier(MySink.INPUT1)
    private SubscribableChannel inputChannel;

    /**
     * stream处理方式
     * @param message
     */
    @StreamListener(MySink.INPUT1)
    public void handleMessage(Message<String> message){
        String payload = message.getPayload();
        log.info("成功消费消息:" + payload);
    }


}
