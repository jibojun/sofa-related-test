package com.sofarpctest.service.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_4:34 PM
 */
@ImportResource("classpath*:spring-context-service.xml")
@SpringBootApplication(scanBasePackages = "com.sofarpctest.service.impl")
public class ServiceStarter {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ServiceStarter.class);
        ApplicationContext applicationContext = springApplication.run(args);
//        SpringApplication.run(ServiceStarter.class);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
