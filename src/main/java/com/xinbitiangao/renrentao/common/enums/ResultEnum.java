package com.xinbitiangao.renrentao.common.enums;

import lombok.Getter;

/**
 * 全局返回状态码
 * Created by 黄大胖子
 * 2018/5/5 23:00
 */
@Getter
public enum ResultEnum {

    /**
     * 成功
     */
    SUCCESS(0, "成功"),
    /**
     * 未知错误
     */
    UNKNOWN(1, "未知错误");

    /**
     * 代码
     */
    private Integer code;
    /**
     * 含义
     */
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
