package com.imooc.sell.service.Impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductInfoEnums;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/20 00:37
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() {
        ProductInfo productInfo = productInfoService.findOne("1");
        System.out.println(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        System.out.println(productInfoList);
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,1);
        Page<ProductInfo> productInfos = productInfoService.findAll(pageRequest);
        System.out.println(productInfos.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo("3","皮皮虾",new BigDecimal(2),20,"店长推荐！","蛋炒饭.jpg", ProductInfoEnums.DOWN.getCode(),3);
        productInfoService.save(productInfo);
    }
}