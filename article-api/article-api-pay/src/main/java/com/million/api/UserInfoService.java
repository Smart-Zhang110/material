package com.million.api;

import com.million.constains.SystemConstains;
import com.million.factory.RemotePayFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/2 9:53
 * @description ...
 */
@FeignClient(value = SystemConstains.USER_SERVICE, fallbackFactory = RemotePayFallbackFactory.class)
public interface UserInfoService {

    /**
     * 用户信息
     * @return
     */
    @GetMapping("/user/getUserInfo/{user}")
    String getUserInfo(@PathVariable(value = "user") String user);



}
