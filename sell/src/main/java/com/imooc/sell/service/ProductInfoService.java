package com.imooc.sell.service;

import com.imooc.sell.DTO.CartDTO;
import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务
 *
 * @Auther: 宇哥哥
 * @Date: 2018/8/19 23:18
 * @Description:
 */
public interface ProductInfoService {

    ProductInfo findOne(String ProductId);

    /**
     * 查询所有上架商品
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询
     *
     * @param pageable 页码
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
