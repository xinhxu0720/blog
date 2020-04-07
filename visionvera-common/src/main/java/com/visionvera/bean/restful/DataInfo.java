package com.visionvera.bean.restful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import com.visionvera.bean.cms.CameraVO;
import com.visionvera.bean.cms.CaptionsVO;
import com.visionvera.bean.cms.DeviceGroupVO;
import com.visionvera.bean.cms.DeviceTreeVO;
import com.visionvera.bean.cms.DeviceVO;
import com.visionvera.bean.cms.LogVO;
import com.visionvera.bean.cms.MeetingDevVO;
import com.visionvera.bean.cms.RoleVO;
import com.visionvera.bean.cms.ScheduleMsgVO;
import com.visionvera.bean.cms.ScheduleReportVO;
import com.visionvera.bean.cms.ScheduleVO;
import com.visionvera.bean.cms.UserVO;
import com.visionvera.bean.cms.VCRVO;
import com.visionvera.bean.cms.WorkAreaVO;
import com.visionvera.bean.cms.WorkDepartVO;
import com.visionvera.bean.cms.WorkUnitVO;

/**
 * 自定义webservice错误返回信息
 * 
 * @author xiechengsuan 创建日期 2016.11.10
 */
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@XmlSeeAlso({ UserVO.class, DeviceVO.class, DeviceGroupVO.class,
		ScheduleVO.class, ScheduleMsgVO.class, ScheduleReportVO.class, LogVO.class, RoleVO.class, WorkAreaVO.class,
		WorkDepartVO.class, WorkUnitVO.class, MeetingDevVO.class,VCRVO.class, CameraVO.class,CaptionsVO.class,DeviceTreeVO.class})
public class DataInfo<T> {
	@XmlTransient
	private List<T> items = new ArrayList<T>();// 列表数据
	private HashMap<String, Object> extra; //可扩展参数集合

	// 仅包含get方法，未包含set方法
	@XmlElement(name = "item")
	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public HashMap<String, Object> getExtra() {
		return extra;
	}

	public void setExtra(HashMap<String, Object> extra) {
		this.extra = extra;
	}
}
