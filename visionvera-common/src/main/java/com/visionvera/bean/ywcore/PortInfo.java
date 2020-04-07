package com.visionvera.bean.ywcore;

import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2019-11-02
 */

public class PortInfo {

private static final long serialVersionUID = 1L;

	private Integer id;
	/**
	 * 端口号
	 */
	private Integer port;
	/**
	 * 端口说明
	 */
	private String description;
	/**
	 * 状态（0 正常 -1删除）
	 */
	private Integer state;
	/**
	 * 修改时间
	 */
	private String modifyTime;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Override
	public String toString() {
		return "PortInfo{" +
			   "id=" + id +
			   ", port=" + port +
			   ", description=" + description +
			   ", state=" + state +
			   ", modifyTime=" + modifyTime +
			"}";
	}
}
