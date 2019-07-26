package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.CusType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CusTypeMapper {

    //增加客户类型
    public int addCusType(CusType cusType);


}
