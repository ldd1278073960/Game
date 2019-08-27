package com.one.games.domain.entity;

public class GameType {
    /**
    * 游戏类型ID
    */
    private Integer gameTypeId;

    /**
    * 游戏类型名字
    */
    private String gameTypeName;

    /**
    * 是否使用,1为不使用,0为使用
    */
    private Integer gameTypeStatus;

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public String getGameTypeName() {
        return gameTypeName;
    }

    public void setGameTypeName(String gameTypeName) {
        this.gameTypeName = gameTypeName;
    }

    public Integer getGameTypeStatus() {
        return gameTypeStatus;
    }

    public void setGameTypeStatus(Integer gameTypeStatus) {
        this.gameTypeStatus = gameTypeStatus;
    }
}