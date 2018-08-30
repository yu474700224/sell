package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/22 12:12
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "yugege";
    @Test
    public void SaveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("2");
        orderMaster.setBuyerName("小伶俐");
        orderMaster.setBuyerPhone("18756156");
        orderMaster.setBuyerAddress("chengdu");
        orderMaster.setBuyerOpenid("xiaolingli123");
        orderMaster.setOrderAmount(new BigDecimal(50.00));
        OrderMaster result = repository.save(orderMaster);
        System.out.println(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0,1);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, request);
        System.out.println(result.getTotalElements());
    }
}