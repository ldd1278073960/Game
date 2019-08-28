package com.one.games.service.impl;

import com.one.games.domain.entity.GameDetails;
import com.one.games.mapper.GameDetailsMapper;
import com.one.games.service.GameDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author k&d
 * @Date 2019/8/27 17:39
 */
@Service("gameDetailService")
public class GameDetailImpl implements GameDetailService {

    @Resource
    GameDetailsMapper gameDetailsMapper;

    @Override
    public GameDetails showDetails(int gameDetailsId) {
        GameDetails gameDetails = gameDetailsMapper.findById(gameDetailsId);
        return gameDetails;
    }
}
