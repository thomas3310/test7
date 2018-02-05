/*
* Copyright (c) 2016 www.bsfit.com.cn All Rights Reserved.
*/
package com.practice.controller;

import com.alibaba.fastjson.JSON;
import com.practice.pojo.User;
import com.practice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YeJunwei  Date: 2016/12/5 Time: 10:31
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUserById(String id){
        User user=userService.getUserById(id);
        String userStr= JSON.toJSONString(user);
        return userStr;
    }
}