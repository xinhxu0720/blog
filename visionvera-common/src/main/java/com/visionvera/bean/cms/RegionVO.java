package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: RegionVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2017年2月10日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class RegionVO {

	public RegionVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String id;					//行政单位ID（主键）
	private String pid;				//上级行政单位ID
	private String name; 				//行政单位名称
	private Integer gradeId;			//行政级别
	private String isLeaf;				//是否为叶子节点
	private String updateTime;			//行政单位信息更新时间
	private Integer devNum;              //该行政区域下的设备总量，包含子节点下的设备数量
	
	private Long serverCount;		//区域下的服务器数量，包含子节点下的服务器
	private Long serverOnlineCount;	//区域下的在线服务器数量，包含子节点下的服务器
	private String regionId;			//成员单位所属行政单位ID
	
	
	public Long getServerCount() {
		return serverCount;
	}
	public void setServerCount(Long serverCount) {
		this.serverCount = serverCount;
	}
	
	public Long getServerOnlineCount() {
		return serverOnlineCount;
	}
	public void setServerOnlineCount(Long serverOnlineCount) {
		this.serverOnlineCount = serverOnlineCount;
	}
	
	public Integer getDevNum() {
		return devNum;
	}
	public void setDevNum(Integer devNum) {
		this.devNum = devNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public String getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gradeId == null) ? 0 : gradeId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegionVO other = (RegionVO) obj;
		if (gradeId == null) {
			if (other.gradeId != null)
				return false;
		} else if (!gradeId.equals(other.gradeId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		return true;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
}
