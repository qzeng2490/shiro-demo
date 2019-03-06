package com.qzeng2490.demo.sevice.impl;


import com.qzeng2490.demo.dao.UserInfoDao;
import com.qzeng2490.demo.entity.UserInfo;
import com.qzeng2490.demo.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}