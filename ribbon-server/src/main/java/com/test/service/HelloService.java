package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/he",method = RequestMethod.GET)
    @ResponseBody
    public String getHelloContent() {
        return restTemplate.getForObject("http://CLIENT-SERVER/", String.class);
    }

}
