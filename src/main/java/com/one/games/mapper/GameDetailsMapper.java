package com.one.games.mapper;

import com.one.games.domain.entity.GameDetails;

public interface GameDetailsMapper {
    int deleteByPrimaryKey(Integer gameDetailsId);

    int insert(GameDetails record);

    int insertSelective(GameDetails record);

    GameDetails selectByPrimaryKey(Integer gameDetailsId);

    int updateByPrimaryKeySelective(GameDetails record);

    int updateByPrimaryKey(GameDetails record);
}