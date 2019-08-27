package com.one.games.controller;

import com.one.games.domain.entity.Banner;
import com.one.games.service.BannerService;
import com.one.games.service.impl.BannerServiceImpl;
import com.one.games.utils.BannerResult;
import com.one.games.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("home")
@RestController
public class HomeController {

    @Resource
    BannerService bannerService;

    @RequestMapping("/banner")
    public Object getBanner() {
        try {
            BannerResult banner = bannerService.getBanner();
            return Result.success(banner);
        }catch (Exception e){
            return Result.error();
        }
    }

}
