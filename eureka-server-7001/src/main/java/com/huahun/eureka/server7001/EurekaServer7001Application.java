package com.huahun.eureka.server7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServer7001Application
 * @Description TODO
 * @Author zzh
 * @Date 2021/7/22 15:59
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Application.class, args);
    }
}