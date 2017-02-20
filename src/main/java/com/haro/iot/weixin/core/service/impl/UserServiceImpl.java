package com.haro.iot.weixin.core.service.impl;

import com.haro.iot.weixin.core.mapper.TUserMapper;
import com.haro.iot.weixin.core.pojo.TUser;
import com.haro.iot.weixin.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shan on 2017/2/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper tUserMapper;//注入dao


    @Override
    public void addUser(TUser user) {
        // TODO Auto-generated method stub
        tUserMapper.insert(user);

    }

    @Override
    public TUser getUserById(int userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }
}
