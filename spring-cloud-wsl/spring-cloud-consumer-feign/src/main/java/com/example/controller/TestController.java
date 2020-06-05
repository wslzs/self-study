package com.example.controller;

import com.example.feign.FeignTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangshilin
 */
@RestController
public class TestController {
    @Autowired
    private FeignTestClient feignTestClient;

    @GetMapping("/feign/test/{name}")
    public String test(@PathVariable String name) {
        return feignTestClient.test(name);
    }
}
