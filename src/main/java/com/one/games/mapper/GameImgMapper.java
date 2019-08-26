package com.one.games.mapper;

import com.one.games.domain.entity.vo.GameImgVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface GameImgMapper {

    /**
     * 图片画廊
     * @return
     */
    List<GameImgVo> findByGameImg();

}
