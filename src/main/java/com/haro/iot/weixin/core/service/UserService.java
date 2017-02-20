package com.haro.iot.weixin.core.service;

import com.haro.iot.weixin.core.pojo.TUser;

/**
 * Created by shan on 2017/2/13.
 */
public interface UserService {

    /**
     8      * 添加用户
     9      * @param user
     10      */
    void addUser(TUser user);

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    TUser getUserById(int userId);
    /**
     * aesfd
     */
}
