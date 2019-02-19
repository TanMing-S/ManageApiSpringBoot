package com.test.Controller;

import com.test.impl.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello() {
        return helloService.getHello();
    }

}
