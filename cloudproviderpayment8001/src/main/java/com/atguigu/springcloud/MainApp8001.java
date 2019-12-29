package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/28 19:47
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8001.class,args);
        //asdasdkjhkjhjkjhgjhghkgkjjkhkjhjkhjjkhjkhasdasdasd
    }
}
