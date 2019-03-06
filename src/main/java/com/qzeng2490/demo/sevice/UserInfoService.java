package com.qzeng2490.demo.sevice;


import com.qzeng2490.demo.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}