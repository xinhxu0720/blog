package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志
 *
 */
public class TLog implements Serializable {
	private static final long serialVersionUID = 1L;

	private String uuid;//主键UUID

    private Integer logType;//日志类型

    private String description;//描述信息

    private String createName;//用户登录名

    private Boolean result;//操作结果.true表示成功，false表示失败

    private Date createTime;//创建时间

    private String platformId;//可登陆平台ID

    private String errMsg;//错误信息。在result为false时可填写相关错误原因
    
    private String token;//访问令牌
    
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg == null ? null : errMsg.trim();
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}