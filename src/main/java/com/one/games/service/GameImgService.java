package com.one.games.service;

import com.one.games.domain.entity.vo.GameImgVo;

import java.util.List;

public interface GameImgService {

    /**
     * 图片画廊
     * @return
     */
    List<GameImgVo> findByGameImg();

}
