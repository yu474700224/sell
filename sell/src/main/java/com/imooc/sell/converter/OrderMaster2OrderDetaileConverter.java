package com.imooc.sell.converter;

import com.imooc.sell.DTO.OrderDTO;
import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/30 01:04
 * @Description:
 */
public class OrderMaster2OrderDetaileConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return  orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
