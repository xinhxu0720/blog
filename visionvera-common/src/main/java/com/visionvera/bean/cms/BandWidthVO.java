package com.visionvera.bean.cms;

import java.io.Serializable;

/**
 * 全国省份带宽表的实体类
 *
 */
public class BandWidthVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;						//行政区域。和前端的ID号对应
	
	private String name;					//行政区域名称
	
	private String regionId;				//行政区域ID
	
	private Integer bandwidth;				//国干带宽
	
	private String threshold;   			//带宽阈值
	
	private String curremtBandwidthTime;	//获取当前带宽的时间

	public BandWidthVO() {
	}

	public BandWidthVO(String id, String name, String regionId, Integer bandwidth, String threshold,
			String curremtBandwidthTime) {
		super();
		this.id = id;
		this.name = name;
		this.regionId = regionId;
		this.bandwidth = bandwidth;
		this.threshold = threshold;
		this.curremtBandwidthTime = curremtBandwidthTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getThreshold() {
		return threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

	public String getCurremtBandwidthTime() {
		return curremtBandwidthTime;
	}

	public void setCurremtBandwidthTime(String curremtBandwidthTime) {
		this.curremtBandwidthTime = curremtBandwidthTime;
	}
}
