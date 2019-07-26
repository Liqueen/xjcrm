package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CustomerMapper {

    //查询所有客户信息
    public List<Customer> getAllCus();

    //增加客户信息
    public int addCusInfo(Customer customer);


}
