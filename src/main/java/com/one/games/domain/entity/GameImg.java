package com.one.games.domain.entity;

import lombok.Data;

/**
 * 游戏图片
 * @author Administrator
 */
@Data
public class GameImg {
    /**
    * 游戏图片id
    */
    private Integer gameImgId;

    /**
    * 游戏图片地址
    */
    private String gameImgUrl;

    /**
    * 游戏配置id
    */
    private Integer gameDetailsId;

    /**
    * 是否使用,1为使用,0为不使用
    */
    private Integer gameImgStatus;

    /**
     * 与game外键
     */
    private Integer gameId;
}