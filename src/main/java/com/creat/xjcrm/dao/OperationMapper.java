package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.PerType;
import com.creat.xjcrm.bean.PerYear;
import com.creat.xjcrm.bean.Performance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OperationMapper {

    //查询所有业绩
    public List<Performance> getAllPer();

    //查询业绩年份
    public List<PerYear> getPerYear();
    //查询业绩类型
    public List<PerType> getPerType();
    //增加业绩目标
    public int addPerforman(Performance performance);

}
