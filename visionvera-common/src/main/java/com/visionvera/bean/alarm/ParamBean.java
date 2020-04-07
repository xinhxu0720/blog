package com.visionvera.bean.alarm;

public class ParamBean {
	private String pageNum; 
	private String pageSize;      
	private String beginTime; 
	private String endTime; 
	private String recentlyTime; 
	private String level; 
	private String province; 
	private String city; 
	private String state; 
	private String type; 
	private String sort;
	private Integer bits;	//标识是16位/64位告警
	private String detail;
	private String ywUuid;	//运维中心uuid
	private String ticketState;
	private String selectParam;
	private String token;
	
	public String getPageNum() {
		return pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getRecentlyTime() {
		return recentlyTime;
	}
	public void setRecentlyTime(String recentlyTime) {
		this.recentlyTime = recentlyTime;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getBits() {
		return bits;
	}

	public void setBits(Integer bits) {
		this.bits = bits;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getYwUuid() {
		return ywUuid;
	}

	public void setYwUuid(String ywUuid) {
		this.ywUuid = ywUuid;
	}

	public String getTicketState() {
		return ticketState;
	}

	public void setTicketState(String ticketState) {
		this.ticketState = ticketState;
	}

	public String getSelectParam() {
		return selectParam;
	}
	public void setSelectParam(String selectParam) {
		this.selectParam = selectParam;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
