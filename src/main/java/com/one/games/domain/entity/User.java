package com.one.games.domain.entity;

import lombok.Data;

/**
 * 用户表
 */
@Data
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private Integer userAdmin;
    private Integer userStatus;
    private String userCretime;
}
