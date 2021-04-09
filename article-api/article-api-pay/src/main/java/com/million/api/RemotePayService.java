package com.million.api;

import com.million.constains.SystemConstains;
import com.million.factory.RemotePayFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/2 9:53
 * @description ...
 */
@FeignClient(value = SystemConstains.PAY_SERVICE, fallbackFactory = RemotePayFallbackFactory.class)
public interface RemotePayService {

    /**
     * 支付接口
     * @return
     */

    @GetMapping("/order")
    String payOrder();

    /**
     * 支付人用户信息
     * @return
     */
    /**
     * 订单支付者信息
     * @param userName
     * @return
     */
    @RequestMapping("/order/userinfo/{name}")
    String orderUserInfo(@PathVariable(value = "name") String userName);
}
