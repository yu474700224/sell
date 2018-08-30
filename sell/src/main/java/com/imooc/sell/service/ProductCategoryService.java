package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目服务
 * @Auther: 宇哥哥
 * @Date: 2018/8/19 22:58
 * @Description:
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
