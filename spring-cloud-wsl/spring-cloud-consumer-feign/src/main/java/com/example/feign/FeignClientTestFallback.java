package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * @ClassName FeignClientTestFallback
 * @Description: 断融配置类
 * @Author WangShiLin
 * @Date 2020/4/18
 * @Version V1.0
 **/
@Component
public class FeignClientTestFallback implements FeignTestClient {

    @Override
    public String test(String name) {
        return name + "您好，提供者调用失败！可能是服务未启用";
    }
}
