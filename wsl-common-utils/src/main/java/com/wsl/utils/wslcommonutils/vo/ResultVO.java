package com.wsl.utils.wslcommonutils.vo;

import lombok.Data;

/**
 * 统一web返回类
 * @param <T>
 * @author wsl
 */
@Data
public class ResultVO<T> {
    private String status;

    private String code;

    private String msg;

    private T resultBody;

    public ResultVO() {
    }

    public ResultVO(T resultBody) {
        this.resultBody = resultBody;
    }
}
