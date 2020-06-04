package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.entity.ProviderTestDTO;
import com.example.entity.ResultVO;
import com.example.service.IProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ConsumerController
 * @Description: TODO
 * @Author WangShiLin
 * @Date 2020/2/22
 * @Version V1.0
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    // Dubbo远程调用注解
    @Reference
    private IProviderService providerService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResultVO getList(){
        // 远程调用
        List<ProviderTestDTO> providerTestDTOList = providerService.queryList();
        return new ResultVO.Builder<>().code(200).message("success").data(providerTestDTOList).build();
    }
}
