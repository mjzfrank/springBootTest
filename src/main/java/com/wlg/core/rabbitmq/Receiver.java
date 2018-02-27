package com.wlg.core.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/2/27.
 */
//消息消费者
@Component
public class Receiver {
    @RabbitListener(queues = "hello")
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }

    @RabbitListener(queues = "lscs")
    public void processlscs(String hello) {
        System.out.println("Receiver : " + hello);
    }
}