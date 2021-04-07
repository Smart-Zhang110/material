package com.million.articlepay.service;

import com.million.api.RemotePayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/6 14:12
 * @description ...
 */
@Component
public class PayService {

    @Autowired
    private RemotePayService remotePayService;

    public String payOrder(){
        return remotePayService.payOrder();
    }
}
