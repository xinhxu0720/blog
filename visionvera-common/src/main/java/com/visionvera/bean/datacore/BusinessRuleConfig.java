package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2019-03-18
 */

public class BusinessRuleConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	private Integer id;
	/**
	 * 掐断业务开关（1 关闭 2 按业务类型  3 按业务来源 ）
	 */
	private Integer switchRule;
	/**
	 * 掐断触发规则 （1 超国干流量  2 超过阈值）
	 */
	private Integer triggerRule;
	/**
	 * 同优先级掐断原则（1 先开启的业务  2 后开启的业务）
	 */
	private Integer priority;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 备注
	 */
	private String remark;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSwitchRule() {
		return switchRule;
	}
	public void setSwitchRule(Integer switchRule) {
		this.switchRule = switchRule;
	}
	public Integer getTriggerRule() {
		return triggerRule;
	}
	public void setTriggerRule(Integer triggerRule) {
		this.triggerRule = triggerRule;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "BusinessRuleConfig{" +
			   "id=" + id +
			   ", switchRule=" + switchRule +
			   ", triggerRule=" + triggerRule +
			   ", priority=" + priority +
			   ", updateTime=" + updateTime +
			   ", remark=" + remark +
			"}";
	}
}
