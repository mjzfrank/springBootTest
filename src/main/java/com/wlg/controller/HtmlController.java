package com.wlg.controller;

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
}
