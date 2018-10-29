package com.sofatest.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-10-29 15:17
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.sofatest.web.controller"})
public class SofaTestWeb {
    public static void main(String[] args) {
        SpringApplication.run(SofaTestWeb.class);
    }
}
