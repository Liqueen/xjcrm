package com.creat.xjcrm.service;

import com.creat.xjcrm.bean.Depart;
import com.creat.xjcrm.dao.departMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartService {

    @Autowired
    departMapper dm;

    public int deleteByPrimaryKey(Integer departId){
        return dm.deleteByPrimaryKey(departId);
    };

    public int insert(Depart record){
        System.out.println("service服务已启动...");
        return dm.insert(record);
    };

    public List<Depart> selectDepart(){
        System.out.println("查询所有部门");
        return dm.selectDepart();
    }

    public Depart selectByPrimaryKey(Integer departId){
        return dm.selectByPrimaryKey(departId);
    };

    public int updateByPrimaryKeySelective(Depart record){
        return dm.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(Depart record){
        return dm.updateByPrimaryKey(record);
    };

}
