package com.one.games.mapper;

import com.one.games.domain.entity.ForumComment;

public interface ForumCommentMapper {
    int deleteByPrimaryKey(Integer forumCommentId);

    int insert(ForumComment record);

    int insertSelective(ForumComment record);

    ForumComment selectByPrimaryKey(Integer forumCommentId);

    int updateByPrimaryKeySelective(ForumComment record);

    int updateByPrimaryKey(ForumComment record);
}