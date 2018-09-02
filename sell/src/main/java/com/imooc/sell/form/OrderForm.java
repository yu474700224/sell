package com.imooc.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/31 23:05
 * @Description:
 */
@Data
public class OrderForm {

    /**
     * 姓名
     */
    @NotEmpty(message = "姓名不能为空")
    private String name;

    /**
     *电话
     */
    @NotEmpty(message = "电话不能为空")
    private String phone;

    /**
     * 地址
     */

    @NotEmpty(message = "地址不能为空")
    private String address;

    /**
     * 微信id
     */
    @NotEmpty(message = "微信id不能为空")
    private String openid;

    /**
     * 列表
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
