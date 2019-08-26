package com.one.games.mapper;

import com.one.games.domain.entity.User;

import java.util.List;

/**
 * @author k&d
 * @Date 2019/8/26 19:39
 */
public interface UserMapper {
    List<User> save();
    List<User> entry();
}
