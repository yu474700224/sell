package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/21 00:18
 * @Description:
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String catagoryName;

    @JsonProperty("type")
    private Integer catagoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoOVList;
}
