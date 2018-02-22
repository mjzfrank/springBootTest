package com.wlg.controller;

import com.wlg.util.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/2/22.
 */
@Controller
@RequestMapping("to")
public class HtmlController {
    @RequestMapping("index")
    public String index(ModelMap map){
        map.addAttribute("name","吴");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }


    @RequestMapping("/hello2")
    public String hello2() throws Exception {
        throw new MyException("发生错误2");
    }
}
