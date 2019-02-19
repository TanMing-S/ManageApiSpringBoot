package com.test.impl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "client-server", fallback = HelloImplService.class)
public interface HelloService {

    @RequestMapping(value = "/")
    String getHello();
}
