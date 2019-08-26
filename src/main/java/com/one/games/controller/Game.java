package com.one.games.controller;

import com.one.games.domain.entity.vo.GameImgVo;
import com.one.games.service.GameImgService;
import com.one.games.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@Slf4j
public class Game {

    @Resource
    GameImgService gameImgService;

    /**
     * 图片画廊
     * @return
     */
    @GetMapping("/gameImgGallery")
    public Result gameImgGallery(){

        try{
            List<GameImgVo> byGameImg = gameImgService.findByGameImg();
            return Result.success(byGameImg);
        }catch (Exception e){
            log.error(e.getMessage());
            return Result.error();
        }
    }

}
