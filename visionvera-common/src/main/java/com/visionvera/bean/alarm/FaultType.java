package com.visionvera.bean.alarm;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaow on 2018/6/5. AlarmDomain
 */
public class FaultType implements Cloneable, Serializable {
	private static final long serialVersionUID = -178733088072575362L;
	private Integer id;//故障类别id
	private String code;//故障名称
	private String chn;//故障名称
	private String eng;//对应subType
	private Integer level;//对应subTypeName
	private Integer parentId;//故障父类别
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChn() {
		return chn;
	}
	public void setChn(String chn) {
		this.chn = chn;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
