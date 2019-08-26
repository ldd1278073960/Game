package com.one.games.service.impl;


import com.one.games.domain.entity.vo.GameImgVo;
import com.one.games.service.GameImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class GameImgMapperImpl implements GameImgService{

    @Resource
    GameImgService gameImgService;


    @Override
    public List<GameImgVo> findByGameImg() {
        List<GameImgVo> byGameImg = gameImgService.findByGameImg();
        return byGameImg;
    }
}
