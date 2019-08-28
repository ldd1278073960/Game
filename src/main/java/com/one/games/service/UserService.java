package com.one.games.service;

import com.one.games.domain.entity.User;

/**
 * @author k&d
 * @Date 2019/8/27 22:28
 */
public interface UserService {
    void register(User user);
    User login(String username, String userPassword);
    User findByUserName(String username);
}
