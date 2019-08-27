package com.one.games.domain.entity;

import java.util.Date;

public class Forum {
    /**
     * 论坛表id
     */
    private Integer forumId;

    /**
     * 论坛标题
     */
    private String forumTitle;

    /**
     * 论坛创建时间
     */
    private Date fprumCretime;

    /**
     * 用户ID-外键
     */
    private Integer userId;

    /**
     * 游戏类型
     */
    private Integer gameTypeId;

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getForumTitle() {
        return forumTitle;
    }

    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle;
    }

    public Date getFprumCretime() {
        return fprumCretime;
    }

    public void setFprumCretime(Date fprumCretime) {
        this.fprumCretime = fprumCretime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }
}