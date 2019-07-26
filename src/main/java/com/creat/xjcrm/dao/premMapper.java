package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.Prem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface premMapper {
    int deleteByPrimaryKey(Integer premId);

    int insert(Prem record);

    int insertSelective(Prem record);

    Prem selectByPrimaryKey(Integer premId);

    int updateByPrimaryKeySelective(Prem record);

    int updateByPrimaryKey(Prem record);
}