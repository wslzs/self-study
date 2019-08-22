package com.wsl.utils.wslcommonutils.vo;

import lombok.Data;

import java.util.HashMap;

/**
 * 统一web返回类
 *
 * @author wsl
 */
@Data
public class ResultVO extends HashMap<String, Object> {

    public ResultVO() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static ResultVO error() {
        return error(1, "操作失败");
    }

    public static ResultVO error(String msg) {
        return error(500, msg);
    }

    public static ResultVO error(int code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.put("code", code);
        resultVO.put("msg", msg);
        return resultVO;
    }

    public static ResultVO ok(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.put("msg", msg);
        return resultVO;
    }
}
