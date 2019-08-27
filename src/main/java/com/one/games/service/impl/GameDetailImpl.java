package com.one.games.service.impl;

import com.one.games.domain.entity.GameDetails;
import com.one.games.mapper.GameDetailsMapper;
import com.one.games.service.GameDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author k&d
 * @Date 2019/8/27 17:39
 */
@Service("gameDetailService")
public class GameDetailImpl implements GameDetailService {

    @Resource
    GameDetailsMapper gameDetailsMapper;

    @Override
    public List<GameDetails> showDetails(int gameDetailsId) {
        List<GameDetails> gameDetails = gameDetailsMapper.selectById(gameDetailsId);
        return gameDetails;
    }
}
