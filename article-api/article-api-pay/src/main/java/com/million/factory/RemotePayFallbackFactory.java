package com.million.factory;

import com.million.api.UserInfoService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Service;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/2 10:06
 * @description ...
 */
@Service
public class RemotePayFallbackFactory implements FallbackFactory<UserInfoService> {


    @Override
    public UserInfoService create(Throwable cause) {
        return new UserInfoService() {

            @Override
            public String getUserInfo(String user) {
                return null;
            }
        };
    }
}
