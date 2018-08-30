package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/19 23:22
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;
    @Test
    public void findAllByProductStatus() {
        List<ProductInfo> productInfoList = repository.findAllByProductStatus(1);
        System.out.println(productInfoList);
    }

    @Test
    public void ProductInfoSava(){
        List<ProductInfo> productInfoList = new ArrayList<ProductInfo>();
        ProductInfo productInfo1 = new ProductInfo("1","皮蛋粥",new BigDecimal(2.5),100,"超级好吃的粥哦！","皮蛋粥.jpg",1,2);
        ProductInfo productInfo2 = new ProductInfo("2","蛋炒饭",new BigDecimal(8.0),20,"店长推荐！","蛋炒饭.jpg",1,3);
        ProductInfo result = repository.save(productInfo2);
        Assert.assertNotNull(result);
    }
}