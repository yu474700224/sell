package com.imooc.sell.controller;

import com.imooc.sell.VO.ProductInfoVO;
import com.imooc.sell.VO.ProductVO;
import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductInfoEnums;
import com.imooc.sell.service.ProductCategoryService;
import com.imooc.sell.service.ProductInfoService;
import com.imooc.sell.utils.ResultVOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/20 23:31
 * @Description:
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    ProductInfoService productInfoService;

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping(value = "list")
    public ResultVO list() {
        //查询商品信息
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //查询商品类目
        List<Integer> catagroyTypeList = new ArrayList<>();

        for (ProductInfo productInfo : productInfoList) {
            catagroyTypeList.add(productInfo.getCategoryType());
        }
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(catagroyTypeList);
        //拼装
        List<ProductVO> productVOList = new ArrayList<>();

        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCatagoryName(productCategory.getCategoryName());
            productVO.setCatagoryType(productCategory.getCategoryType());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoOV = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoOV);
                    productInfoVOList.add(productInfoOV);
                }
            }
            productVO.setProductInfoOVList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtils.Success(productVOList);
    }


}
