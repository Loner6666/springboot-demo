package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Description：响应码枚举
 * @Author：GuoFeng
 * @CreateTime：2021-04-01
 */
@Getter
@ToString
@AllArgsConstructor
public enum CodeEnum {

    SUCCESS("200", "操作成功"),
    FAIL("500", "操作失败");

    private String code;
    private String message;


}
