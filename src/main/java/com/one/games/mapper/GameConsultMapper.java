package com.one.games.mapper;

import com.one.games.domain.entity.GameConsult;

public interface GameConsultMapper {
    int deleteByPrimaryKey(Integer gameConsultId);

    int insert(GameConsult record);

    int insertSelective(GameConsult record);

    GameConsult selectByPrimaryKey(Integer gameConsultId);

    int updateByPrimaryKeySelective(GameConsult record);

    int updateByPrimaryKey(GameConsult record);
}