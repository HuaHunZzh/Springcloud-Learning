package com.huahun.eureka.server7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServer7002Application
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 15:59
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002Application.class, args);
    }
}