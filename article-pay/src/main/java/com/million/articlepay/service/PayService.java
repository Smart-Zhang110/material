package com.million.articlepay.service;

import com.million.api.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/6 14:12
 * @description ...
 */
@Component
public class PayService {

    @Autowired
    private UserInfoService userInfoService;

    public String payOrder(String name){
        return userInfoService.getUserInfo(name);
    }
}
