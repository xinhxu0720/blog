package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台类别表
 *
 */
public class TPlatformTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer platformType;//平台类别

    private String platformName;//平台名称

    private Date createTime;//创建时间

    private Date updateTime;//最后一次更新时间

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
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
}