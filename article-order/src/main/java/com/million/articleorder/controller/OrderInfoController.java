package com.million.articleorder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/15 14:57
 * @description ...
 */
@RestController
@RequestMapping("/order")
public class OrderInfoController {

    @GetMapping("/orderInfo")
    public String orderInfo(){
        return null;
    }

}
