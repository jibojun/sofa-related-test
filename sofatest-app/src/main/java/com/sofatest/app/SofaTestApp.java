package com.sofatest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-10-29 16:13
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.sofatest.app.impl"})
public class SofaTestApp {
    public static void main(String[] args) {
        SpringApplication.run(SofaTestApp.class);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
