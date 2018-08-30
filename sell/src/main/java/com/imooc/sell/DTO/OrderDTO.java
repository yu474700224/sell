package com.imooc.sell.DTO;

import com.imooc.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 00:56
 * @Description:
 */
@Data
public class OrderDTO {
    /**
     * 订单编号.
     */
    private String orderId;

    /**
     * 买家姓名.
     */
    private String buyerName;

    /**
     * 买家电话.
     */
    private String buyerPhone;

    /**
     * 买家地址.
     */
    private String buyerAddress;

    /**
     * 买家微信ID.
     */
    private String buyerOpenid;

    /**
     * 订单总金额.
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态，默认状态为0（新订单）
     */
    private Integer orderStatus;

    /**
     * 支付状态,默认状态为0（等待支付）
     */

    private Integer payStatus ;

    /**
     * 创建时间.
     */
    private Date createTime;

    /**
     * 更新时间.
     */
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
