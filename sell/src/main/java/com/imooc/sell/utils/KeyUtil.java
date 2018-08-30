package com.imooc.sell.utils;

import java.util.Random;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/25 02:06
 * @Description:
 */
public class KeyUtil {

    /**
     * 生产唯一的随机数
     * 规格：时间戳 + 6位随机数
     * @return
     */
    public static  synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
