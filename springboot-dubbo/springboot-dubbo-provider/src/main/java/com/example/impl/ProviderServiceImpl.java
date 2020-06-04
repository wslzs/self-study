package com.example.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.entity.ProviderTestDTO;
import com.example.service.IProviderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProviderServiceImpl
 * @Description: TODO
 * @Author WangShiLin
 * @Date 2020/2/22
 * @Version V1.0
 **/
@Service
public class ProviderServiceImpl implements IProviderService {
    @Override
    public List<ProviderTestDTO> queryList() {
        // 初始化数据
        ProviderTestDTO testDTO1 = new ProviderTestDTO();
        testDTO1.setId(1);
        testDTO1.setName("学生");
        testDTO1.setNumber(100);
        ProviderTestDTO testDTO2 = new ProviderTestDTO();
        testDTO2.setId(2);
        testDTO2.setName("教师");
        testDTO2.setNumber(101);
        // 组装数据
        List<ProviderTestDTO> list = new ArrayList<>();
        list.add(testDTO1);
        list.add(testDTO2);
        return list;
    }
}
