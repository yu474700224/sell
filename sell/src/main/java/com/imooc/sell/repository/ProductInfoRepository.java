package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/19 23:17
 * @Description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findAllByProductStatus(Integer productStatus);
}
