package com.creat.xjcrm.service;

import com.creat.xjcrm.bean.Employee;
import com.creat.xjcrm.bean.Message;
import com.creat.xjcrm.dao.employeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    employeeMapper em;

    //员工登录
    public Employee loginSys(Employee employee){
        return em.loginSys(employee);
    };

    //查询所有员工
    public List<Employee> getAllRmp(){
        return em.getAllRmp();
    }

    //增加员工
    public int addEmp(Employee employee){
        return em.addEmp(employee);
    };

    //发布公告
    public int addMsg(Message message){
        return em.addMsg(message);
    };

    //查看所有公告
    public List<Message> getNewMsg(){
        return em.getNewMsg();
    };
    //查询所有公告
    public List<Message> getAllMsg(){
        return em.getAllMsg();
    }

    //根据部门名称查询所有员工
    public List<Employee> getEmpByDepartName(String depart){
        return em.getEmpByDepartName(depart);
    };

}
