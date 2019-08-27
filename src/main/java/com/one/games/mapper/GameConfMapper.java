package com.one.games.mapper;

import com.one.games.domain.entity.GameConf;

public interface GameConfMapper {
    int deleteByPrimaryKey(Integer gameConfId);

    int insert(GameConf record);

    int insertSelective(GameConf record);

    GameConf selectByPrimaryKey(Integer gameConfId);

    int updateByPrimaryKeySelective(GameConf record);

    int updateByPrimaryKey(GameConf record);
}