package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CarModel implements Serializable {
    //序列化版本号 反序列化时必须版本一致才能成功
    private static final long serialVersionUID = 1L;
    private Integer carId;

    private String carName;

    private Integer carSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date carTime;

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarId() {
        return carId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCarSex() {
        return carSex;
    }

    public void setCarSex(Integer carSex) {
        this.carSex = carSex;
    }

    public Date getCarTime() {
        return carTime;
    }

    public void setCarTime(Date carTime) {
        this.carTime = carTime;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


    @Override
    public String toString() {
        return "CarModel{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carSex=" + carSex +
                ", carTime=" + carTime +
                '}';
    }
}