package com.creat.xjcrm.controller;

import com.creat.xjcrm.bean.Depart;
import com.creat.xjcrm.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/depart")
public class DepartController {

    @Autowired
    DepartService ds;

    //增加部门
    @GetMapping(path = "/adddepart.do")
    public int addDepart(Depart record, HttpServletResponse response){
        System.out.println("请求以到达");
        System.out.println(record.getDepart_id()+","+record.getDepart_name());
        return ds.insert(record);
    }

    //查询所有部门
    @PostMapping(path = "/querydepart.do")
    public List<Depart> queryDepart(){
        System.out.println("查询所有部门请求以到达");
        return ds.selectDepart();
    }

}
