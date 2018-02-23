package com.wlg.controller;

import com.wlg.model.BookBean;
import com.wlg.model.PeopleBean;
import com.wlg.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/22.
 */
@RestController
@RequestMapping("test")
public class TestRestController {
    @Autowired
    private PeopleBean peopleBean;
    @Autowired
    private BookBean bookBean;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/people")
    public String people(){
        return "name:"+peopleBean.getName()+";  age:"+peopleBean.getAge()+";    sex:"+peopleBean.getSex();
    }

    @RequestMapping(value = "/book")
    public String book(){
        return "name:"+bookBean.getName()+";    author:"+bookBean.getAuthor()+";   price:"+bookBean.getPrice();
    }

    @RequestMapping(value = "/redis/string", method = RequestMethod.GET)
    public void insertString() {
        stringRedisTemplate.opsForValue().set("stringKey", "stringValue");
        User u = new User("蜘蛛侠",26);
        User u2 = new User("钢铁侠",26);
        redisTemplate.opsForValue().set(u.getName(),u);
        redisTemplate.opsForValue().set(u2.getName(),u2);
    }
}
