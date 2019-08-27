package com.one.games.mapper;

import com.one.games.domain.entity.GameComment;

public interface GameCommentMapper {
    int deleteByPrimaryKey(Integer gameCommentId);

    int insert(GameComment record);

    int insertSelective(GameComment record);

    GameComment selectByPrimaryKey(Integer gameCommentId);

    int updateByPrimaryKeySelective(GameComment record);

    int updateByPrimaryKey(GameComment record);
}