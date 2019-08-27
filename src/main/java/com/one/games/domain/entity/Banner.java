package com.one.games.domain.entity;

public class Banner {
    /**
    * 轮播图id
    */
    private Integer bannerId;

    /**
    * 轮播类型
    */
    private String bannerType;

    /**
    * 游戏ID-外键
    */
    private Integer gameId;

    /**
    * 轮播图片

    */
    private String bannerImg;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }
}