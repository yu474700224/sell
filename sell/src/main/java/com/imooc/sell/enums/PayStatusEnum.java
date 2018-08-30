package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/22 11:52
 * @Description:
 */
@Getter
public enum  PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
