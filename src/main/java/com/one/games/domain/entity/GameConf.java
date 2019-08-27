package com.one.games.domain.entity;


import lombok.Data;

@Data
public class GameConf {
    /**
    * 游戏配置ID
    */
    private Integer gameConfId;

    /**
    * 游戏详情id
    */
    private Integer gameDetailsId;

    /**
    * 推荐操作系统
    */
    private String gameConfRecomOs;

    /**
    * 推荐cpu
    */
    private String gameConfRecomCpu;

    /**
    * 推荐内存
    */
    private String gameConfRecomMem;

    /**
    * 推荐显卡
    */
    private String gameConfRecomGra;

    /**
    * 推荐内存空间
    */
    private String gameConfRecomInter;

    /**
    * 最低操作系统
    */
    private String gameConfLowOs;

    /**
    * 最低cpu
    */
    private String gameConfLowCpu;

    /**
    * 最低内存
    */
    private String gameConfLowMem;

    /**
    * game_conf_low_gar
    */
    private String gameConfLowGar;

    /**
    * 最低内存空间
    */
    private String gameConfLowInter;

    /**
     * game外键
     */
    private Integer gameId;
}