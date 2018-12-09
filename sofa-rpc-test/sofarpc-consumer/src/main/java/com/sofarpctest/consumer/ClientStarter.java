package com.sofarpctest.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_4:52 PM
 */
public class ClientStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context-consumer.xml");
        applicationContext.start();

        BoltConsumer boltConsumer = (BoltConsumer) applicationContext.getBean("boltConsumer");
        boltConsumer.clientOps(1);
    }
}
