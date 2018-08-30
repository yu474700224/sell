package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/18 00:17
 * @Description:
 */

@RunWith(SpringRunner.class )
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory category = repository.findOne(3);
        category.setCategoryId(3);
        category.setCategoryName("男生最爱");
        repository.save(category);
    }

    @Test
    public void findAllByCatagroyType(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> resultList = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,resultList.size());
        System.out.println(resultList.size());
    }
}