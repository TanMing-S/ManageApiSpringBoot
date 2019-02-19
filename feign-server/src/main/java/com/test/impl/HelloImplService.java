package com.test.impl;

import org.springframework.stereotype.Component;

@Component
public class HelloImplService implements HelloService {
    @Override
    public String getHello() {
        return "hello world service is not available !";
    }
}
