package com.one.games.domain.entity;

import lombok.Data;

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
