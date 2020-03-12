package com.gridsum.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhiqiang Lin
 * @Description
 * @create 2020/3/12.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
//        ServiceInstance config = client.getInstances("eureka.client.01").get(0);
//        logger.info("/hello-service:" + config.getHost() + "--------service_id:" + config.getServiceId());
        logger.info("hello world");
        return "hello-service";
    }
}
