package com.one.games.mapper;

import com.one.games.domain.entity.GameImg;import com.one.games.domain.entity.vo.GameImgVo;import java.util.List;

public interface GameImgMapper {
    int deleteByPrimaryKey(Integer gameImgId);

    int insert(GameImg record);

    int insertSelective(GameImg record);

    GameImg selectByPrimaryKey(Integer gameImgId);

    int updateByPrimaryKeySelective(GameImg record);

    int updateByPrimaryKey(GameImg record);

    /**
     * 图片画廊
     *
     * @return 图片集合
     */
    List<GameImgVo> findByGameImg();
}