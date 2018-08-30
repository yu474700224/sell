package com.imooc.sell.DTO;

import lombok.Data;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 02:20
 * @Description:
 */
@Data
public class CartDTO {

    //** 商品ID.*/
    private String productId;

    //** 库存.*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
