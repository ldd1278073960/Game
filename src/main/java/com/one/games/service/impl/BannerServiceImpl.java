package com.one.games.service.impl;

import com.one.games.domain.vo.BannerVo;
import com.one.games.mapper.BannerMapper;
import com.one.games.service.BannerService;
import com.one.games.utils.BannerResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Resource
    private BannerMapper bannerMapper;



    @Override
    public BannerResult getBanner() {
        List<BannerVo> a = bannerMapper.geiBanner("特色轮播");

        List<BannerVo> b = bannerMapper.geiBanner("网游轮播");

        List<BannerVo> c = bannerMapper.geiBanner("首页轮播");

        BannerResult bannerResult = new BannerResult();

        bannerResult.setMainBanner(c);
        bannerResult.setFeatureBanner(a);
        bannerResult.setOnlineBanner(b);


        return bannerResult;
    }
}
