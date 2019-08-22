package com.wsl.utils.wslcommonutils.controller;

import com.wsl.utils.wslcommonutils.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/common/test")
public class testController {
    @GetMapping
    public ResultVO test() {
        return ResultVO.ok("查询成功！");
    }
}
