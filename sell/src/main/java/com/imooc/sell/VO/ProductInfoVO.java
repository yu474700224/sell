package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/21 00:20
 * @Description:
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private double productPrice;

    @JsonProperty("icon")
    protected String productIcon;
}
