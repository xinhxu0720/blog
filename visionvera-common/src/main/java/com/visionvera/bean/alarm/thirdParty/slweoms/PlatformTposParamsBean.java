package com.visionvera.bean.alarm.thirdParty.slweoms;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: PlatformTposParams 
 * @Description: 第三方平台参数表
 * @author quboka
 * @date 2017年12月7日
 */
public class PlatformTposParamsBean implements Serializable {
    
	private static final long serialVersionUID = -8205955298957338440L;
	
	private Integer paramsId;//参数id
	private Integer paramsState;//状态 0 ：正常 -1：删除
	private Integer paramsVersion;//版本号  
	private Date paramsCreatetime;//创建时间
	private Date paramsModifytime;//修改时间

	private static Integer tposId ;//第三方平台信息id
	private Integer paramsType;//参数类型  1：asset_url资产  2：alarm_url报警 3：call_back回调 4：login_url登陆
	private String paramsValues;//参数和值。 k=v&k=v... 的形式存储
	private String paramsScheme;//参数方案
	
	//重写 hashcode 和  equals 方法 。 按照 paramsType、paramsValues、paramsScheme去重
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((paramsScheme == null) ? 0 : paramsScheme.hashCode());
		result = prime * result
				+ ((paramsType == null) ? 0 : paramsType.hashCode());
		result = prime * result
				+ ((paramsValues == null) ? 0 : paramsValues.hashCode());
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
		PlatformTposParamsBean other = (PlatformTposParamsBean) obj;
		if (paramsScheme == null) {
			if (other.paramsScheme != null)
				return false;
		} else if (!paramsScheme.equals(other.paramsScheme))
			return false;
		if (paramsType == null) {
			if (other.paramsType != null)
				return false;
		} else if (!paramsType.equals(other.paramsType))
			return false;
		if (paramsValues == null) {
			if (other.paramsValues != null)
				return false;
		} else if (!paramsValues.equals(other.paramsValues))
			return false;
		return true;
	}
	
	
	public Integer getParamsId() {
		return paramsId;
	}
	public void setParamsId(Integer paramsId) {
		this.paramsId = paramsId;
	}
	public Integer getParamsState() {
		return paramsState;
	}
	public void setParamsState(Integer paramsState) {
		this.paramsState = paramsState;
	}
	public Integer getParamsVersion() {
		return paramsVersion;
	}
	public void setParamsVersion(Integer paramsVersion) {
		this.paramsVersion = paramsVersion;
	}
	public Date getParamsCreatetime() {
		return paramsCreatetime;
	}
	public void setParamsCreatetime(Date paramsCreatetime) {
		this.paramsCreatetime = paramsCreatetime;
	}
	public Date getParamsModifytime() {
		return paramsModifytime;
	}
	public void setParamsModifytime(Date paramsModifytime) {
		this.paramsModifytime = paramsModifytime;
	}
	public Integer getTposId() {
		return tposId;
	}
	public void setTposId(Integer tposId) {
		PlatformTposParamsBean.tposId = tposId;
	}
	public Integer getParamsType() {
		return paramsType;
	}
	public void setParamsType(Integer paramsType) {
		this.paramsType = paramsType;
	}
	public String getParamsValues() {
		return paramsValues;
	}
	public void setParamsValues(String paramsValues) {
		this.paramsValues = paramsValues;
	}
	public String getParamsScheme() {
		return paramsScheme;
	}
	public void setParamsScheme(String paramsScheme) {
		this.paramsScheme = paramsScheme;
	}
	
	 
	
	
}
