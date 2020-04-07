/*
 * Hospital.java
 * ------------------*
 * 2019-10-23 created
 */
package com.visionvera.bean.datacore;

import java.util.Date;

/**
 * 医院相关信息
 * ----------------------*
 * 2019-10-23created
 */
public class Hospital {

    private Long id;
    /**
     *医院名称
     */
    private String hospitalName;
    /**
     *医院级别
     */
    private Integer hospitalLevel;
    /**
     * 医院级别名称
     */
    private String levelName;
    /**
     *开通时间
     */
    private Date openingTime;
    /**
     *医护人员数
     */
    private Integer peopleNum;
    /**
     *行政区域
     */
    private String area;
    /**
     *行政省份
     */
    private String province;
    /**
     *行政市区
     */
    private String city;
    /**
     *行政县
     */
    private String county;
    /**
     *行政乡镇
     */
    private String town;
    /**
     *uuid 供网管使用
     */
    private String uuid;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *更新时间
     */
    private Date updateTime;
    /**
     *省市县乡镇行政id 逗号分割
     */
    private String regions;
    private String lastRegion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public Integer getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(Integer hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions == null ? null : regions.trim();
    }

    public String getLastRegion() {
        return lastRegion;
    }

    public void setLastRegion(String lastRegion) {
        this.lastRegion = lastRegion;
    }
}