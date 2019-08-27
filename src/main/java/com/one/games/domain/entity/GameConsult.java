package com.one.games.domain.entity;

public class GameConsult {
    /**
    * 游戏咨询id
    */
    private Integer gameConsultId;

    /**
    * game_consult_title
    */
    private String gameConsultTitle;

    /**
    * game_consult_conte
    */
    private String gameConsultConte;

    /**
    * 游戏ID 外键
    */
    private Integer gameId;

    public Integer getGameConsultId() {
        return gameConsultId;
    }

    public void setGameConsultId(Integer gameConsultId) {
        this.gameConsultId = gameConsultId;
    }

    public String getGameConsultTitle() {
        return gameConsultTitle;
    }

    public void setGameConsultTitle(String gameConsultTitle) {
        this.gameConsultTitle = gameConsultTitle;
    }

    public String getGameConsultConte() {
        return gameConsultConte;
    }

    public void setGameConsultConte(String gameConsultConte) {
        this.gameConsultConte = gameConsultConte;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}