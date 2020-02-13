package com.springcloudstudy.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

public interface MySource  {

    String OUTPUT1 = "mySource1";
    String OUTPUT2 = "mySource2";

    @Output(OUTPUT1)
    MessageChannel output1();

    @Output(OUTPUT2)
    MessageChannel output2();
}
