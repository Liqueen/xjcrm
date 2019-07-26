package com.creat.xjcrm.service.customer;

import com.creat.xjcrm.bean.Customer;
import com.creat.xjcrm.dao.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerMapper cm;

    public int addCusInfo(Customer customer){
        logger.info("增加客户");
        return cm.addCusInfo(customer);
    }

    public List<Customer> getAllCus(){
        return cm.getAllCus();
    };


}
