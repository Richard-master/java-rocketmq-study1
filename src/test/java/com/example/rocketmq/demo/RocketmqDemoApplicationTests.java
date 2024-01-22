package com.example.rocketmq.demo;

import com.example.rocketmq.demo.producer.MyProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RocketmqDemoApplicationTests {

    @Autowired
    private MyProducer producer;

    @Test
    void contextLoads() {
    }

    @Test
    void testMessage(){
        String topic = "my-boot-topic";
        String message = "hello rocket mq springboot message";
        producer.sendMessage(topic,message);
        System.out.println("消息发送成功");
    }
}
