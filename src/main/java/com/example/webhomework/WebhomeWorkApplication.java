package com.example.webhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.webhomework")
public class WebhomeWorkApplication {

    public static void main(String[] args) {
        //这里是启动代码
        SpringApplication.run(WebhomeWorkApplication.class, args);
    }

}
