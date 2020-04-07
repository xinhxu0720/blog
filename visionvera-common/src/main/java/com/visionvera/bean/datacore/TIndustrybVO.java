package com.visionvera.bean.datacore;

import java.io.Serializable;

import com.visionvera.bean.base.BaseTimeEntity;

public class TIndustrybVO extends BaseTimeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;//主键ID

    private String name;//行业归属名

    private String bz;

    private String createid;//创建用户

    private String createtime;//创建时间

    private String updateid;//修改用户的ID

    private String updatetime;//最后一次更新时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid == null ? null : createid.trim();
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

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}