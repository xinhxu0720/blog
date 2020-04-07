package com.visionvera.bean.datacore;

import java.io.Serializable;

public class TApplicationdevicebVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;//主键ID

    private String devname;//平台名称

    private String devtype;//平台类型

    private String url;//地址

    private String ip;//IP

    private String loginuser;

    private String loginpwd;

    private String regionid;

    private String xxdz;

    private String zbjd;

    private String zbwd;

    private String whfzr1;

    private String whfzrtel1;

    private String createid;//创建人ID

    private String createname;

    private String createtime;

    private String updateid;

    private String updatename;

    private String updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname == null ? null : devname.trim();
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser == null ? null : loginuser.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz == null ? null : xxdz.trim();
    }

    public String getZbjd() {
        return zbjd;
    }

    public void setZbjd(String zbjd) {
        this.zbjd = zbjd == null ? null : zbjd.trim();
    }

    public String getZbwd() {
        return zbwd;
    }

    public void setZbwd(String zbwd) {
        this.zbwd = zbwd == null ? null : zbwd.trim();
    }

    public String getWhfzr1() {
        return whfzr1;
    }

    public void setWhfzr1(String whfzr1) {
        this.whfzr1 = whfzr1 == null ? null : whfzr1.trim();
    }

    public String getWhfzrtel1() {
        return whfzrtel1;
    }

    public void setWhfzrtel1(String whfzrtel1) {
        this.whfzrtel1 = whfzrtel1 == null ? null : whfzrtel1.trim();
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid == null ? null : createid.trim();
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdateid() {
        return updateid;
    }

    public void setUpdateid(String updateid) {
        this.updateid = updateid == null ? null : updateid.trim();
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename == null ? null : updatename.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}