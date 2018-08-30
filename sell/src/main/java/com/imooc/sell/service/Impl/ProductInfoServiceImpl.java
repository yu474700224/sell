package com.imooc.sell.service.Impl;

import com.imooc.sell.DTO.CartDTO;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductInfoEnums;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.repository.ProductInfoRepository;
import com.imooc.sell.sellexception.SellException;
import com.imooc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/20 00:28
 * @Description:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    ProductInfoRepository repository;
    @Override
    public ProductInfo findOne(String ProductId) {
        return repository.findOne(ProductId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findAllByProductStatus(ProductInfoEnums.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOList) {
            for (CartDTO cartDTO : cartDTOList){
                ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
                if(productInfo == null){
                    throw  new SellException(ResultEnum.PRODUCT_NOT_EXIST);
                }

                Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
                if(result < 0){
                    throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
                }

                productInfo.setProductStock(result);
                repository.save(productInfo);
            }
    }
}
