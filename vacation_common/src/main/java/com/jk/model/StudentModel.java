package com.jk.model;

public class StudentModel {
    private String sname;

    private Integer stelephone;

    private String sprefessional;

    private String wechat;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getStelephone() {
        return stelephone;
    }

    public void setStelephone(Integer stelephone) {
        this.stelephone = stelephone;
    }

    public String getSprefessional() {
        return sprefessional;
    }

    public void setSprefessional(String sprefessional) {
        this.sprefessional = sprefessional == null ? null : sprefessional.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }
}