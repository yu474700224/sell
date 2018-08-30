package com.imooc.sell.service;

import com.imooc.sell.DTO.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 00:58
 * @Description:
 */
public interface OrderService {
    //** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    //** 查询单个订单. */
    OrderDTO findOne(String orderid);

    //** 查询订单列表. */
    Page<OrderDTO> findList(String uyerOpenId, Pageable pageable);

    //** 取消订单. */
    OrderDTO cancel(OrderDTO orderDTO);

    //** 完结订单.*/
    OrderDTO finish(OrderDTO orderDTO);

    //** 支付订单.*/
    OrderDTO paid(OrderDTO orderDTO);
}
