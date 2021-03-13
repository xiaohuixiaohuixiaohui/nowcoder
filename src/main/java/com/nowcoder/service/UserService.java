package com.nowcoder.service;

import com.nowcoder.entity.User;
import com.nowcoder.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserMapper userMapper;
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findUserById(int id ){
        return userMapper.selectById(id);
    }
}
