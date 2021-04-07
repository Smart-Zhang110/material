package com.million.articlepay.controller;

import com.million.articlepay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/2 10:53
 * @description ...
 */
@RestController
public class PayController {

    @Autowired
    private PayService payOrder;

    @GetMapping("/order")
    public String pay(){
        return payOrder.payOrder();
    }
}
