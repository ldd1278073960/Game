package com.one.games.service.impl;

import com.one.games.domain.entity.User;
import com.one.games.mapper.UserMapper;
import com.one.games.service.UserService;
import com.one.games.utils.UserBean;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author k&d
 * @Date 2019/8/26 19:38
 */
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public UserBean registerUser() {
        UserBean userBean = new UserBean();
        List<User> users = userMapper.save();
        userBean.setUsers(users);
        return userBean;
    }

    @Override
    public UserBean login() {

        return null;
    }
}
