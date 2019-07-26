package com.creat.xjcrm.controller;

import com.creat.xjcrm.bean.Employee;
import com.creat.xjcrm.bean.Message;
import com.creat.xjcrm.bean.Msg;
import com.creat.xjcrm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @Autowired
    HttpServletRequest request;

    //员工登录
    @RequestMapping(path = "/login",method = {RequestMethod.POST})
    public Employee loginSys(Employee employee){
        Employee emp = es.loginSys(employee);
        HttpSession session = request.getSession();
        //服务端验证
        if (emp != null) {   //如果查出来有该用户,则将用户信息保存在session中
            session.setAttribute("Emp",emp);
        }
        return emp;
    }

    //查询所有员工
    @RequestMapping(path = "/getAllEmp.do",method = {RequestMethod.POST})
    public List<Employee> getAllRmp(){
        System.out.println("请求查询所有员工控制器");
        return es.getAllRmp();
    }


    //增加员工
    @RequestMapping(path = "/addEmp.do",method = {RequestMethod.POST})
    public int addEmp(Employee employee){
        System.out.println("增加员工信息");
        employee.setState("已入职");
        return es.addEmp(employee);
    }

    //发布公告
    @RequestMapping(path = "/addMessage.do",method = {RequestMethod.POST})
    public Msg addMessage(Message message){
        message.setState("未读");
        message.setType("公司公告");
        int me = es.addMsg(message);
        Msg msg = new Msg();
        msg.setType("method : addMessage");
        if (me > 0){
            //做标记
            msg.setContent("true");
            return msg;
        }
        msg.setContent("false");
        return msg;
    }

    //查看最新公告
    @RequestMapping(path = "/getNewMsg.do",method = {RequestMethod.POST})
    public List<Message> getNewMsg(){
        return es.getNewMsg();
    };
    //查询所有公告
    @RequestMapping(path = "/getAllMsg.do",method = {RequestMethod.POST})
    public List<Message> getAllMsg(){
        return es.getAllMsg();
    }

    @RequestMapping(path = "/getEmpByDepartName.do",method = {RequestMethod.POST})
    public List<Employee> getEmpByDepartName(String depart){
        return es.getEmpByDepartName(depart);
    };

}
