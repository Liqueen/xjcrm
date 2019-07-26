package com.creat.xjcrm.service.user;

import com.creat.xjcrm.bean.Role;
import com.creat.xjcrm.dao.RoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    //日志记录
    Logger logger = LoggerFactory.getLogger(RoleService.class);

    @Autowired
    RoleMapper rm;

    public List<Role> getAllRole(){
        logger.info("查询角色");
        return rm.getAllRole();
    }

}
