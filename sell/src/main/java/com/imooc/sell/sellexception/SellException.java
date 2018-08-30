package com.imooc.sell.sellexception;

import com.imooc.sell.enums.ResultEnum;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 01:23
 * @Description:
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessge());
        this.code = resultEnum.getCode();
    }
}
