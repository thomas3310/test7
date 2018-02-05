package com.practice.service;

import com.practice.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: YeJunwei  Date: 2016/12/5 Time: 10:54
 */
public interface IUserService {
    User getUserById(String id);
}