package com.springcloudstudy.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink  {
    String INPUT1 = "mySink1";
    String INPUT2 = "mySink2";

    @Input(INPUT1)
    SubscribableChannel mySink1();


    @Input(INPUT2)
    SubscribableChannel mySink2();

}
