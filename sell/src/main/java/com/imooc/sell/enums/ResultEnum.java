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

    ORDER_STATUS_ERROR(14,"订单状态异常"),

    ORDER_UPDATE_ERROR(15,"订单更新错误"),

    ORDER_PAID_ERROR(16,"订单支付状态异常"),

    ORDER_PAID_STUTAS_ERROR(17,"订单支付状态更新异常"),

    PAPAM_ERROR(1,"参数错误"),

    CART_EMPTY(18,"购物车为空")
    ;

    private Integer code;

    private String messge;

    ResultEnum(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }

}
