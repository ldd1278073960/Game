package com.one.games.domain.entity;

public class Game {
    /**
    * 游戏ID
    */
    private Integer gameId;

    /**
    * 游戏名字
    */
    private String gameName;

    /**
    * 1为不使用,0为使用
    */
    private Integer gameStatus;

    /**
    * 游戏类型
    */
    private Integer gameTypeId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Integer gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }
}