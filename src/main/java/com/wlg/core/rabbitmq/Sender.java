package com.wlg.core.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2018/2/27.
 */
//消息生存者
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        //产生文本发送到hello 队列中
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void send2() {
        String context = "天天卡牌" + new Date();
        System.out.println("Sender : " + context);
        //产生文本发送到hello 队列中
        this.rabbitTemplate.convertAndSend("lscs", context);
    }

}
