package com.wsl.consumer.service.fallback;

import com.wsl.consumer.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FallbackServiceImpl implements FeignService {

    @Override
    public String test(String message) {
        return "test fallback";
    }
}
