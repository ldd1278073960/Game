package com.one.games.mapper;

import com.one.games.domain.entity.GameCommentImg;

public interface GameCommentImgMapper {
    int deleteByPrimaryKey(Integer gameCommentImgId);

    int insert(GameCommentImg record);

    int insertSelective(GameCommentImg record);

    GameCommentImg selectByPrimaryKey(Integer gameCommentImgId);

    int updateByPrimaryKeySelective(GameCommentImg record);

    int updateByPrimaryKey(GameCommentImg record);
}