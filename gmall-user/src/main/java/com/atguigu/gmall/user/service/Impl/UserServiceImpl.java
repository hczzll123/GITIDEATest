package com.atguigu.gmall.user.service.Impl;

import com.atguigu.gmall.user.bean.User;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hcz
 * @date 2020/1/5 - 16:41
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAllUserList() {
        return userMapper.getAllUserList();
    }
}
