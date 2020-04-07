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

public class BusinessScoreConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID主键
	 */
	private Integer id;
	/**
	 * 业务名称
	 */
	private String name;
	/**
	 * 业务类型
	 */
	private Integer type;
	/**
	 * 优先级分数
	 */
	private Integer score;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 是否已删除
	 */
	private Integer isDel;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
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
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "BusinessScoreConfig{" +
			   "id=" + id +
			   ", name=" + name +
			   ", type=" + type +
			   ", score=" + score +
			   ", updateTime=" + updateTime +
			   ", isDel=" + isDel +
			   ", remark=" + remark +
			"}";
	}
}
