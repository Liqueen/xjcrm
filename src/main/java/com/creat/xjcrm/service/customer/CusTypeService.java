package com.creat.xjcrm.service.customer;

import com.creat.xjcrm.bean.CusType;
import com.creat.xjcrm.dao.CusTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusTypeService {

    @Autowired
    CusTypeMapper ctm;

    public int addCusType(CusType cusType){
        return ctm.addCusType(cusType);
    }

}
