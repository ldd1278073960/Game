package com.one.games.domain.entity;

public class GameCommentImg {
    /**
     * 论坛图片id
     */
    private Integer gameCommentImgId;

    /**
     * 论坛id
     */
    private Integer gameCommentId;

    /**
     * 论坛图片名字
     */
    private String gameCommentName;

    public Integer getGameCommentImgId() {
        return gameCommentImgId;
    }

    public void setGameCommentImgId(Integer gameCommentImgId) {
        this.gameCommentImgId = gameCommentImgId;
    }

    public Integer getGameCommentId() {
        return gameCommentId;
    }

    public void setGameCommentId(Integer gameCommentId) {
        this.gameCommentId = gameCommentId;
    }

    public String getGameCommentName() {
        return gameCommentName;
    }

    public void setGameCommentName(String gameCommentName) {
        this.gameCommentName = gameCommentName;
    }
}