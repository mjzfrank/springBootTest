package com.wlg.controller;

import com.wlg.model.BookBean;
import com.wlg.model.PeopleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/22.
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private PeopleBean peopleBean;
    @Autowired
    private BookBean bookBean;

    @RequestMapping(value = "/people")
    public String people(){
        return "name:"+peopleBean.getName()+";  age:"+peopleBean.getAge()+";    sex:"+peopleBean.getSex();
    }

    @RequestMapping(value = "/book")
    public String book(){
        return "name:"+bookBean.getName()+";    author:"+bookBean.getAuthor()+";   price:"+bookBean.getPrice();
    }

    @RequestMapping(value = "/index")
    public	String T(ModelMap modelMap){
        modelMap.addAttribute("host", "http://blog.didispace.com");
        return 	"index";
    }
}
