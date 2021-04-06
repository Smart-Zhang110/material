package com.million.factory;

import com.million.api.RemotePayService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/2 10:06
 * @description ...
 */
@Component
public class RemotePayFallbackFactory implements FallbackFactory<RemotePayService> {


    @Override
    public RemotePayService create(Throwable throwable) {

        return new RemotePayService(){

            @Override
            public String payOrder() {
                return null;
            }

        };
    }
}
