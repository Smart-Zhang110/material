package com.million.articlepay.controller;

import com.million.api.RemotePayService;
import com.million.articlepay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;


/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/2 10:53
 * @description ...
 */
@Controller
public class PayController {

    @Autowired
    private PayService payOrder;

    @GetMapping("/pay")
    public String pay(){
        return payOrder.payOrder();
    }
}
