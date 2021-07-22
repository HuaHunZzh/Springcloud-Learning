package com.huahun.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName EurekaServerApplication
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 15:59
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}