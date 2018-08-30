package com.imooc.sell.VO;

import lombok.Data;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/20 23:28
 * @Description:
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //消息
    private String messge;

    //返回的数据
    private T data;
}
