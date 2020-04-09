package com.visionvera.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LabelVO {

    private Integer id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    private String name;
    private Integer clickNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClickNumber() {
        return clickNumber;
    }

    public void setClickNumber(Integer clickNumber) {
        this.clickNumber = clickNumber;
    }
}
