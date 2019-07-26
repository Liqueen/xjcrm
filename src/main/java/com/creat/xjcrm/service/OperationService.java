package com.creat.xjcrm.service;

import com.creat.xjcrm.bean.PerType;
import com.creat.xjcrm.bean.PerYear;
import com.creat.xjcrm.bean.Performance;
import com.creat.xjcrm.dao.OperationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {

    @Autowired
    OperationMapper om;

    //查询所有业绩
    public List<Performance> getAllPer(){
        return om.getAllPer();
    };

    //查询业绩年份
    public List<PerYear> getPerYear(){
        return om.getPerYear();
    };
    //查询业绩类型
    public List<PerType> getPerType(){
        return om.getPerType();
    };
    //增加业绩目标
    public int addPerforman(Performance performance){
        return om.addPerforman(performance);
    };

}
