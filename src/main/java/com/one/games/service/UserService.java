package com.one.games.service;

import com.one.games.domain.entity.User;

/**
 * @author k&d
 * @Date 2019/8/26 19:37
 */

public interface UserService {
     /**
      * 添加用户
      * @param user
      */
     void register(User user);

     /**
      * 根据账号密码核查登录
      * @param username
      * @param userPassword
      * @return
      */
     User login(String username,String userPassword);

    /**
     * 根据名称用户名查询
     * @param username
     * @return
     */
     User findByUserName(String username);
}
