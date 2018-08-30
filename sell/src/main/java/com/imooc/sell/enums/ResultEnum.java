package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 01:23
 * @Description:
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"商品库存有问题"),

    ORDER_NOT_EXIST(12,"订单不存在"),

    ORDERDETAIL_NOT_EXIST(13,"订单详情不存在"),
    ;

    private Integer code;

    private String messge;

    ResultEnum(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }

}
