package com.one.games.mapper;

<<<<<<< HEAD
import com.one.games.domain.entity.User;
import org.apache.ibatis.annotations.Param;


/**
 * @author k&d
 * @Date 2019/8/26 19:39
 */
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
    /**
     * 根据用户名查找用户
     */
    User findByUserNameAndPassword(
            @Param("username")String username,
            @Param("password")String userPassword);

    /**
     * 根据用户查找
     * @param username
     * @return
     */

    User findByUserName(String username);
}
=======

public interface UserMapper {

}
>>>>>>> origin/bev
