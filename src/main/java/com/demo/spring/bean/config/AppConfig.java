package com.demo.spring.bean.config;

import lombok.Getter;

@Getter
public enum AppConfig {
    
    SPRING_CONFIG("application-context.xml");
    
    private String appContextConfigFile;
    
    AppConfig (String configFileName) {
        this.appContextConfigFile = configFileName;
    }
}