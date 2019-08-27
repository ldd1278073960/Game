package com.one.games.service.impl;


import com.one.games.domain.vo.GameImgVo;
import com.one.games.mapper.GameImgMapper;
import com.one.games.service.GameImgService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class GameImgServiceImpl implements GameImgService{

    @Resource
    GameImgMapper gameImgMapper;


    @Override
    public List<GameImgVo> findByGameImg() {
        List<GameImgVo> gameImgVos = gameImgMapper.byFindGameImgVo();
        return gameImgVos;
    }
}
