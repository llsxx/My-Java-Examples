package com.ox.model;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "order.A")
public class ConsumerQueueListener {
    @RabbitHandler
    public void queueListenerHandle(String msg){
        System.out.println("消息内容："+msg);
    }
}
