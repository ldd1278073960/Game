package com.one.games.service;


import com.one.games.domain.entity.GameDetails;
import org.apache.ibatis.annotations.Param;



/**
 * @author k&d
 * @Date 2019/8/27 17:35
 */
public interface GameDetailService {
    GameDetails showDetails(@Param("gameDetailsId")int gameDetailsId);
}
