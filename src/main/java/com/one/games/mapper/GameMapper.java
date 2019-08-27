package com.one.games.mapper;


import com.one.games.domain.entity.Game;

import java.util.List;

public interface GameMapper {

    /**
     * 返回首页游戏轮播图
     * @return
     */
     List<Game> homeOnlineGameInf();

    /**
     * 评价最高的游戏
     * @return
     */
     List<Game> bastGame();
}