package com.example.rocketmq.demo.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname
 * @Description
 */
@Component
public class MyProducer {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void sendMessage(String topic,String message){
        rocketMQTemplate.convertAndSend(topic,message);
    }
}
