package com.million.articlepay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangcongcong
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.million")
@SpringBootApplication(scanBasePackages = "com.million")
public class ArticlePayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticlePayApplication.class, args);
    }

}
