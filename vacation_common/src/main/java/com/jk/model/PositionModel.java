package com.jk.model;

import java.io.Serializable;

public class PositionModel implements Serializable {
    private Integer poid;

    private String skill;

    private String learningtime;

    private String coursedes;

    private String repo;

    private String positionname;

    private String salary;

    private String poimg;

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getLearningtime() {
        return learningtime;
    }

    public void setLearningtime(String learningtime) {
        this.learningtime = learningtime == null ? null : learningtime.trim();
    }

    public String getCoursedes() {
        return coursedes;
    }

    public void setCoursedes(String coursedes) {
        this.coursedes = coursedes == null ? null : coursedes.trim();
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo == null ? null : repo.trim();
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getPoimg() {
        return poimg;
    }

    public void setPoimg(String poimg) {
        this.poimg = poimg == null ? null : poimg.trim();
    }
}