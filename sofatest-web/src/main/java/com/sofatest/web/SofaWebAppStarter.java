package com.sofatest.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-10-29 15:17
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.sofatest"})
public class SofaWebAppStarter {
    public static void main(String[] args) {
        SpringApplication.run(SofaWebAppStarter.class);
    }
}
