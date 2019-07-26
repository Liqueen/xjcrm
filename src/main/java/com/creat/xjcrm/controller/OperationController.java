package com.creat.xjcrm.controller;

import com.creat.xjcrm.bean.PerType;
import com.creat.xjcrm.bean.PerYear;
import com.creat.xjcrm.bean.Performance;
import com.creat.xjcrm.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operation")
public class OperationController {

    Logger logger = LoggerFactory.getLogger(OperationController.class);

    @Autowired
    OperationService os;

    //查询所有业绩
    @RequestMapping(path = "/getAllPer.do",method = {RequestMethod.POST})
    public List<Performance> getAllPer(){
        logger.info("method : getAllPer");
        return os.getAllPer();
    };

    //查询业绩年份
    @RequestMapping(path = "/getPerYear.do",method = {RequestMethod.POST})
    public List<PerYear> getPerYear(){
        logger.info("method : getPerYear");
        return os.getPerYear();
    };
    //查询业绩类型
    @RequestMapping(path = "/getPerType.do",method = {RequestMethod.POST})
    public List<PerType> getPerType(){
        logger.info("method : getPerType");
        return os.getPerType();
    };
    //增加业绩目标
    @RequestMapping(path = "/addPerforman.do",method = {RequestMethod.POST})
    public int addPerforman(Performance performance){
        logger.info("method : addPerforman");
        return os.addPerforman(performance);
    };

}
