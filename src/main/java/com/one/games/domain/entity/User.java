package com.one.games.domain.entity;

import lombok.Data;

<<<<<<< HEAD
import java.io.Serializable;

/**
 * 用户表
 */
@Data
public class User implements Serializable {
    private Integer userId;
    private String username;
    private String userPassword;
    private Integer userAdmin;
    private Integer userStatus;
    private String userCretime;
}
=======
import java.util.Date;

@Data
public class User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 1为管理员,0为普通用户
     */
    private Integer userAdmin;

    /**
     * 1为不使用,0为使用
     */
    private Integer userStatus;

    /**
     * 用户创建时间
     */
    private Date userCretime;

}
>>>>>>> origin/bev
