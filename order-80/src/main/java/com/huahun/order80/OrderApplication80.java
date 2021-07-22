package com.huahun.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderApplication80
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 1:12
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class, args);
    }
}
