package com.one.games.service.impl;

import com.one.games.domain.entity.User;
import com.one.games.mapper.UserMapper;
import com.one.games.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author k&d
 * @Date 2019/8/26 19:38
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void register(User user) {
       userMapper.addUser(user);
    }

    /**
     *
     * @param username
     * @param userPassword
     */
    @Override
    public User login(String username, String userPassword) {
       return userMapper.findByUserNameAndPassword(username,userPassword);
    }
    /**
     * 查找用户
     * @param username
     * @return
     */
    @Override
    public User findByUserName(String username) {
       return userMapper.findByUserName(username);
    }
}
