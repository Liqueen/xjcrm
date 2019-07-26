package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface postMapper {
    int deleteByPrimaryKey(Integer postId);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}