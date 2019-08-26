package com.one.games.domain.entity;

import lombok.Data;

/**
 * 游戏图片
 */
@Data
public class GameImg {

    private int gameImgId;
    private String gameImgUrl;
    private int gameDetailsId;
    private int gameImgStatus;

}
