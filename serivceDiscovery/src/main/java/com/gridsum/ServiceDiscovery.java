package com.gridsum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Zhiqiang Lin
 * @Description
 * @create 2020/3/12.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceDiscovery {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscovery.class, args);
    }
}
