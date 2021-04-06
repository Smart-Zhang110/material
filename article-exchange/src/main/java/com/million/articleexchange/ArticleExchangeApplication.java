package com.million.articleexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangcongcong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ArticleExchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleExchangeApplication.class, args);
    }

}
