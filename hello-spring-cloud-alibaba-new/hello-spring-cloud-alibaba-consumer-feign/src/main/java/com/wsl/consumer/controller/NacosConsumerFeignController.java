package com.wsl.consumer.controller;

import com.wsl.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConsumerFeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/test/hi")
    public String test() {
        return feignService.test("Hi Feign");
    }
}
