package com.one.games.domain.entity;

import java.util.Date;

public class GameDetails {
    /**
     * 游戏详情ID
     */
    private Integer gameDetailsId;

    /**
     * 游戏概述
     */
    private String gameDetailsSum;

    /**
     * 游戏配置信息
     */
    private String gameDetailsConf;

    /**
     * 游戏创建时间
     */
    private Date gameDetailsCretime;

    /**
     * 游戏发售时间
     */
    private Date gameDetailsTime;

    /**
     * 游戏下载地址
     */
    private String gameDetailsDownl;

    /**
     * 游戏ID-外键
     */
    private Integer gameId;

    public Integer getGameDetailsId() {
        return gameDetailsId;
    }

    public void setGameDetailsId(Integer gameDetailsId) {
        this.gameDetailsId = gameDetailsId;
    }

    public String getGameDetailsSum() {
        return gameDetailsSum;
    }

    public void setGameDetailsSum(String gameDetailsSum) {
        this.gameDetailsSum = gameDetailsSum;
    }

    public String getGameDetailsConf() {
        return gameDetailsConf;
    }

    public void setGameDetailsConf(String gameDetailsConf) {
        this.gameDetailsConf = gameDetailsConf;
    }

    public Date getGameDetailsCretime() {
        return gameDetailsCretime;
    }

    public void setGameDetailsCretime(Date gameDetailsCretime) {
        this.gameDetailsCretime = gameDetailsCretime;
    }

    public Date getGameDetailsTime() {
        return gameDetailsTime;
    }

    public void setGameDetailsTime(Date gameDetailsTime) {
        this.gameDetailsTime = gameDetailsTime;
    }

    public String getGameDetailsDownl() {
        return gameDetailsDownl;
    }

    public void setGameDetailsDownl(String gameDetailsDownl) {
        this.gameDetailsDownl = gameDetailsDownl;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}