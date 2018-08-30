package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/22 01:27
 * @Description:
 */
public class ResultVOUtils {

    public static ResultVO Success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessge("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO Success(){
        return Success(null);
    }

    public static ResultVO Error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessge(msg);
        resultVO.setData(null);
        return resultVO;
    }
}
