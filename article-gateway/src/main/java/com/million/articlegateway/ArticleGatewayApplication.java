package com.million.articlegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangcongcong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ArticleGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleGatewayApplication.class, args);
    }

}
