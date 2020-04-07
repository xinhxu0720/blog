package com.visionvera.bean.datacore;

import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2019-07-23
 */

public class BackupChannel {

private static final long serialVersionUID = 1L;

	/**
	 * 网管ID
	 */
	private String omcid;
	/**
	 * 设备ID
	 */
	private Integer id;
	/**
	 * 备用通道地址
	 */
	private String url;
	/**
	 * 创建记录的用户
	 */
	private String createUser;
	/**
	 * 修改记录的用户
	 */
	private String updateUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 扩展字段1
	 */
	private String field1;
	/**
	 * 扩展字段2
	 */
	private String field2;
	/**
	 * 扩展字段3
	 */
	private String field3;
	/**
	 * 扩展字段4
	 */
	private String field4;

	public String getOmcid() {
		return omcid;
	}
	public void setOmcid(String omcid) {
		this.omcid = omcid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}

	@Override
	public String toString() {
		return "BackupChannel{" +
			   "omcid=" + omcid +
			   ", id=" + id +
			   ", url=" + url +
			   ", createUser=" + createUser +
			   ", updateUser=" + updateUser +
			   ", updateTime=" + updateTime +
			   ", remark=" + remark +
			   ", field1=" + field1 +
			   ", field2=" + field2 +
			   ", field3=" + field3 +
			   ", field4=" + field4 +
			"}";
	}
}
