package com.imooc.sell.controller;

import com.imooc.sell.DTO.OrderDTO;
import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.converter.OrderForm2OrderDTOConverter;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.form.OrderForm;
import com.imooc.sell.sellexception.SellException;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.utils.ResultVOUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/31 23:02
 * @Description:
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("【创建订单】参数错误，orderFrom={}",orderForm);
            throw new SellException(ResultEnum.PAPAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【转换错误】");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO orderResult = orderService.create(orderDTO);
        Map<String,String> map = new HashMap<>();
        map.put("orderid",orderResult.getOrderId());
        return ResultVOUtils.Success(map);

    }
}
