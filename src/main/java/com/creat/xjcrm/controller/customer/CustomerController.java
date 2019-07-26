package com.creat.xjcrm.controller.customer;

import com.creat.xjcrm.bean.Customer;
import com.creat.xjcrm.service.customer.CusTypeService;
import com.creat.xjcrm.service.customer.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cus")
public class CustomerController {

    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService cs;

    //增加客户信息
    @GetMapping(path = "/addCusInfo.do")
    public int addCusInfo(Customer customer){
        logger.info("method : addCusInfo");
        return cs.addCusInfo(customer);
    }

    //查询所有的客户
    @RequestMapping(path = "/getAllCus.do",method = {RequestMethod.POST})
    public List<Customer> getAllCus(){
        logger.info("method : getAllCus");
        return cs.getAllCus();
    };


}
