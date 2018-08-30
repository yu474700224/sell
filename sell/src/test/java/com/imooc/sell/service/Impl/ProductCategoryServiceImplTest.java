package com.imooc.sell.service.Impl;

import com.imooc.sell.dataobject.ProductCategory;
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
 * @Date: 2018/8/19 23:05
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryServiceImpl categoryService;
    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        System.out.println(productCategoryList);
    }

    @Test
    public void findByCategoryTypeIn() {
        List list = Arrays.asList(2,3);
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(list);
        System.out.println(productCategoryList);
    }

    @Test
    public void save() {
        ProductCategory productCategory = categoryService.findOne(1);
        productCategory.setCategoryName("热搜榜");
        categoryService.save(productCategory);
    }
}