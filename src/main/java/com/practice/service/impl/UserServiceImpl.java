/*
* Copyright (c) 2016 www.bsfit.com.cn All Rights Reserved.
*/
package com.practice.service.impl;

import com.practice.mapper.UserMapper;
import com.practice.pojo.User;
import com.practice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: YeJunwei  Date: 2016/12/5 Time: 10:54
 */
@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(String id) {
//        UserExample example=new UserExample();
//        example.createCriteria().andIdEqualTo(id);
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }
}