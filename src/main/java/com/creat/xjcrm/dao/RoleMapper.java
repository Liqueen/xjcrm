package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Component
public interface RoleMapper {

    //查询所有角色
    public List<Role> getAllRole();

}
