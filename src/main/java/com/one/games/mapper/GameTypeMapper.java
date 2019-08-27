package com.one.games.mapper;

import com.one.games.domain.entity.GameType;

public interface GameTypeMapper {
    int deleteByPrimaryKey(Integer gameTypeId);

    int insert(GameType record);

    int insertSelective(GameType record);

    GameType selectByPrimaryKey(Integer gameTypeId);

    int updateByPrimaryKeySelective(GameType record);

    int updateByPrimaryKey(GameType record);
}