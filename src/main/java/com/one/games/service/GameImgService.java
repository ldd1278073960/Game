package com.one.games.service;

import com.one.games.domain.vo.GameImgVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface GameImgService {

    /**
     * 图片画廊
     * @return
     */
    List<GameImgVo> findByGameImg();

}
