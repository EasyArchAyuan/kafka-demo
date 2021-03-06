package com.lh.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * Spring启动类
 *
 * @author lh
 */
@EnableKafka
@SpringBootApplication
public class HellokafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellokafkaApplication.class, args);
    }
}
