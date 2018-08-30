package com.imooc.sell.service.Impl;

import com.imooc.sell.DTO.OrderDTO;
import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 02:40
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    private String BUYEROPENID = "yugege";

    private final String ORDERID = "1535561459824679025";
    @Autowired
    private OrderServiceImpl orderService;
    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("宇哥哥");
        orderDTO.setBuyerAddress("成都");
        orderDTO.setBuyerPhone("18725465132");
        orderDTO.setBuyerOpenid(BUYEROPENID);

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
            orderDetail.setProductId("3");
        orderDetail.setProductQuantity(10);
        orderDetailList.add(orderDetail);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderService.findOne(ORDERID);
        System.out.println(orderDTO);
    }

    @Test
    public void findList() {
        PageRequest pageRequest = new PageRequest(0,1);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYEROPENID,pageRequest);
        System.out.println(orderDTOPage.getContent());
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}