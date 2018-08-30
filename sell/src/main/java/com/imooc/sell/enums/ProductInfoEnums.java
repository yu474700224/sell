package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/20 00:32
 * @Description:
 */
@Getter
public enum ProductInfoEnums {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String messge;

    ProductInfoEnums(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }
}
