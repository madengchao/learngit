package com.xiaoyi.web.controller;

import com.xiaoyi.pojo.Users;
import com.xiaoyi.service.UsersService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Address: http://www.microetech.cn/
 * @Auther: HEIFENG
 * @Date: 2020/1/28
 * @Description: com.xiaoyi.web.controller
 * @version:1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUsers")
    public String insertUsers(Users users){
        this.usersService.insertUser(users);
        return "OK";
    }
}
