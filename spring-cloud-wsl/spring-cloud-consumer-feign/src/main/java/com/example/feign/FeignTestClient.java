package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangshilin
 */
@FeignClient(name = "provider", fallback = FeignClientTestFallback.class)
public interface FeignTestClient {
    @GetMapping("/test/{name}")
    String test(@PathVariable String name);
}
