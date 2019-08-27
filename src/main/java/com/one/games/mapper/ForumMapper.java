package com.one.games.mapper;

import com.one.games.domain.entity.Forum;

public interface ForumMapper {
    int deleteByPrimaryKey(Integer forumId);

    int insert(Forum record);

    int insertSelective(Forum record);

    Forum selectByPrimaryKey(Integer forumId);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKey(Forum record);
}