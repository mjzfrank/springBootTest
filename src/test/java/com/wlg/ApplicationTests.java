package com.wlg;

import com.wlg.core.Task;
import com.wlg.core.rabbitmq.Sender;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

/**
 * Created by Administrator on 2018/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private Task task;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private Sender sender;

    /*测试多线程*/
    @Test
    public void testTask() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        while (true){
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }

    /*测试邮件*/
    @Test
    public void testJavaMailSender() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("317498820@qq.com");
        message.setTo("947604931@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        javaMailSender.send(message);
    }

    /*测试rabbitMq*/
    @Test
    public void hello() throws Exception {
        sender.send2();
    }
}