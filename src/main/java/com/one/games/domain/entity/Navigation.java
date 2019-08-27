package com.one.games.domain.entity;

public class Navigation {
    /**
     * 导航栏id
     */
    private Integer navigationId;

    /**
     * 导航名
     */
    private String navgationName;

    /**
     * 是否使用,1为不使用,0为使用
     */
    private Integer navgationStatus;

    public Integer getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Integer navigationId) {
        this.navigationId = navigationId;
    }

    public String getNavgationName() {
        return navgationName;
    }

    public void setNavgationName(String navgationName) {
        this.navgationName = navgationName;
    }

    public Integer getNavgationStatus() {
        return navgationStatus;
    }

    public void setNavgationStatus(Integer navgationStatus) {
        this.navgationStatus = navgationStatus;
    }
}