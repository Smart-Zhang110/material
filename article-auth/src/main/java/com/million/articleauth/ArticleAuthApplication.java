package com.million.articleauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangcongcong
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ArticleAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleAuthApplication.class, args);
    }

}
