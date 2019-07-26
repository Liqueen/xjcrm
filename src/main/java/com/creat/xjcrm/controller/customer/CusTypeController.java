package com.creat.xjcrm.controller.customer;

import com.creat.xjcrm.bean.CusType;
import com.creat.xjcrm.service.customer.CusTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cusType")
public class CusTypeController {

    Logger logger = LoggerFactory.getLogger(CusTypeController.class);

    @Autowired
    CusTypeService cts;

    @RequestMapping("/addCusType.do")
    public int addCusType(CusType cusType){
        logger.info("method : addCusType");
        return cts.addCusType(cusType);
    }

}
