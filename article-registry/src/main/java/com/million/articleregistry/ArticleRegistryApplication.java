package com.million.articleregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangcongcong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ArticleRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleRegistryApplication.class, args);
    }

}
