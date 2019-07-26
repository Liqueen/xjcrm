package com.creat.xjcrm.bean;

public class Depart {
    //属性值与数据库列名一致
    private Integer depart_id;
    private String depart_name;
    private String respon;
    private String remark;

    public Integer getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(Integer depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon == null ? null : respon.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}