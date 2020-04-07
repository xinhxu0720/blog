package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 日志
 *
 */
public class TLogBody implements Serializable {
	private static final long serialVersionUID = 1L;

	private String businessId;//操作对象唯一ID

    private Integer operateType;//操作类型

    private String description;//描述信息

    private String loginName;//操作用户登录名

    private Integer result;//操作结果。0表示成功，1表示失败

    private String operateTime;//操作时间

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public Integer getOperateType() {
		return operateType;
	}

	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}