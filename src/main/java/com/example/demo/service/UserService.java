package com.example.demo.service;

import com.example.demo.Dao.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
    void save(User user);
}
