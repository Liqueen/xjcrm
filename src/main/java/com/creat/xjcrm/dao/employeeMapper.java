package com.creat.xjcrm.dao;

import com.creat.xjcrm.bean.Employee;
import com.creat.xjcrm.bean.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface employeeMapper {

    //用户登录
    public Employee loginSys(Employee employee);

    //查询所有员工
    public List<Employee> getAllRmp();

    //新增员工
    public int addEmp(Employee employee);

    //发布公告
    public int addMsg(Message message);

    //查询最新消息
    public List<Message> getNewMsg();
    //查询所有消息
    public List<Message> getAllMsg();

    //根据部门名称来查询员工
    public List<Employee> getEmpByDepartName(String depart);

}