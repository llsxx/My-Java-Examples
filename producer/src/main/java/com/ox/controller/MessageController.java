package com.ox.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/direct/sendMsg")
    public String sendMsg(String exchange,String routingKey,String msg){
        rabbitTemplate.convertAndSend(exchange,routingKey,msg);
        return "已投递";
    }
}
