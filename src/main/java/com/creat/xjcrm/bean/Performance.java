package com.creat.xjcrm.bean;

public class Performance {

    private Integer id;
    private PerYear perYear;
    private PerType perType;
    private String per_targer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PerYear getPerYear() {
        return perYear;
    }

    public void setPerYear(PerYear perYear) {
        this.perYear = perYear;
    }

    public PerType getPerType() {
        return perType;
    }

    public void setPerType(PerType perType) {
        this.perType = perType;
    }

    public String getPer_targer() {
        return per_targer;
    }

    public void setPer_targer(String per_targer) {
        this.per_targer = per_targer;
    }




}
