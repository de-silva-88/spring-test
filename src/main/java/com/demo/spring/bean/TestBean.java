package com.demo.spring.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestBean {

    public TestBean() {
        log.info("Instantiated with Spring IOC");
    }
    
    public String sendHi() {
        return "Hiiiii";
    }
}
