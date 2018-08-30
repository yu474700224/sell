package com.imooc.sell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 宇哥哥
 * @Date: 2018/8/21 00:07
 * @Description:
 */
@RestController
public class test {
    @GetMapping(value = "Hello")
    public String testController(){
        return "Hello";
    }
}

