package com.one.games.domain.entity;

public class GameComment {
    /**
     * 游戏评论表的id
     */
    private Integer gameCommentId;

    /**
     * 游戏评论的内容
     */
    private String gameCommentContent;

    /**
     * 用户ID-外键
     */
    private Integer userId;

    /**
     * 游戏ID-外键
     */
    private Integer gameId;

    public Integer getGameCommentId() {
        return gameCommentId;
    }

    public void setGameCommentId(Integer gameCommentId) {
        this.gameCommentId = gameCommentId;
    }

    public String getGameCommentContent() {
        return gameCommentContent;
    }

    public void setGameCommentContent(String gameCommentContent) {
        this.gameCommentContent = gameCommentContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}