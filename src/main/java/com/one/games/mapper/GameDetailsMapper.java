package com.one.games.mapper;

import com.one.games.domain.entity.GameDetails;

/**
*@author k&d

*@Date 2019/8/27 22:33
*
*
*/

public interface GameDetailsMapper {

    GameDetails findById(Integer gameDetailsId);

}