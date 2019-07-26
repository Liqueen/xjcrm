package com.creat.xjcrm.controller.user;

import com.creat.xjcrm.bean.Role;
import com.creat.xjcrm.service.user.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //日志记录
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    RoleService rs;

    @GetMapping(path = "/getRole.do")
    public List<Role> getAllRole(){
        logger.info("用户权限");
        return rs.getAllRole();
    }


}
