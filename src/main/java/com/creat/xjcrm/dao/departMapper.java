package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.Depart;
import com.creat.xjcrm.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import java.util.List;

@Mapper
@Component
public interface departMapper {
    public int deleteByPrimaryKey(Integer departId);

    //增加部门
    public int insert(Depart record);

    //查询所有部门
    public List<Depart> selectDepart();

    public Depart selectByPrimaryKey(Integer departId);

    public int updateByPrimaryKeySelective(Depart record);

    public int updateByPrimaryKey(Depart record);
}