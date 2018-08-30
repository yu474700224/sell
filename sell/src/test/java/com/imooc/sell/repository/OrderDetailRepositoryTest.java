package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/22 13:09
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void sateTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("2");
        orderDetail.setOrderId("2");
        orderDetail.setProductId("2");
        orderDetail.setProductPrice(new BigDecimal(8));
        orderDetail.setProductIcon("蛋炒饭.jpg");
        orderDetail.setProductQuantity(2);
        orderDetail.setProductName("蛋炒饭");
        OrderDetail result = repository.save(orderDetail);
        System.out.println(result);
    }
    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList =  repository.findByOrderId("1");
        System.out.println(orderDetailList);
    }
}