package com.xiaoyi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Address: http://www.microetech.cn/
 * @Auther: HEIFENG
 * @Date: 2020/1/28
 * @Description: com.xiaoyi.web.controller
 * @version:1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
