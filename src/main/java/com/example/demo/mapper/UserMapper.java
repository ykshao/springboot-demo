package com.example.demo.mapper;

import com.example.demo.Dao.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    void insert(User user);
}
