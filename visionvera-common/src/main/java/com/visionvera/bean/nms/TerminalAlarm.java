package com.visionvera.bean.nms;

import java.util.Date;

/**
 * 网管终端告警信息
 */
public class TerminalAlarm {

    private String alarmid;

    private Integer devid;

    private String name;

    private Integer devno;

    private String mac;

    private String regionid;

    private Date alarmtime;

    private String state;

    private Integer bsstatus;

    private String description;

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid;
    }

    public Integer getDevid() {
        return devid;
    }

    public void setDevid(Integer devid) {
        this.devid = devid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDevno() {
        return devno;
    }

    public void setDevno(Integer devno) {
        this.devno = devno;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }

    public Date getAlarmtime() {
        return alarmtime;
    }

    public void setAlarmtime(Date alarmtime) {
        this.alarmtime = alarmtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getBsstatus() {
        return bsstatus;
    }

    public void setBsstatus(Integer bsstatus) {
        this.bsstatus = bsstatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
