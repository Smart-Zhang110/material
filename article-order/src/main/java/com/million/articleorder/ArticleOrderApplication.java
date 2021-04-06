package com.million.articleorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangcongcong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ArticleOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleOrderApplication.class, args);
    }

}
