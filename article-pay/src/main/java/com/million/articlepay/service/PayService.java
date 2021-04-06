package com.million.articlepay.service;

import com.million.api.RemotePayService;
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

    @Resource
    private RemotePayService remotePayService;

    public String payOrder(){
        return remotePayService.payOrder();
    }
}
