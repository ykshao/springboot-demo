package com.example.demo.service;

import com.example.demo.Dao.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    /*
    * Alt+Insert 选择需要重写的方法即可
    * */
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}
