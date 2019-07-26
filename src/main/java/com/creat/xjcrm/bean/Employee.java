package com.creat.xjcrm.bean;

public class Employee {

    private Integer emp_id;
    private String emp_name;
    private Depart depart;   //部门
    private Post post;       //职位
    private String emp_tel;
    private String state;
    private Integer emp_parent_id;
    private Role role;       //角色


    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getEmp_tel() {
        return emp_tel;
    }

    public void setEmp_tel(String emp_tel) {
        this.emp_tel = emp_tel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getEmp_parent_id() {
        return emp_parent_id;
    }

    public void setEmp_parent_id(Integer emp_parent_id) {
        this.emp_parent_id = emp_parent_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}