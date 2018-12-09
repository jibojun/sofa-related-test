package com.sofarpctest.consumer;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.ImportResource;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_4:52 PM
 */
@ImportResource("classpath*:spring-context-consumer.xml")
@SpringBootApplication(scanBasePackages = "com.sofarpctest.consumer")
public class ClientStarter {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ClientStarter.class);
        ApplicationContext applicationContext = springApplication.run(args);

        BoltConsumer boltConsumer = (BoltConsumer) applicationContext.getBean("boltConsumer");
        boltConsumer.clientOps(1);
    }
}
