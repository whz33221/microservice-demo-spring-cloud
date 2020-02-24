package com.springcloudstudy.baseservice.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Holder {
    @Value("${global-flag}")
    public  String flag;
}
