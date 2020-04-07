/**  
 * @Title: MonitorVO.java
 * @Package com.visionvera.union.bean
 * @Description: TODO
 * @author 谢程算
 * @date 2018年6月26日
 */
package com.visionvera.bean.tgl;

/**
 * ClassName: MonitorVO 
 * @Description: TODO
 * @author 谢程算
 * @date 2018年6月26日
 */
public class MonitorVO {
	private String devNo;               //监控号码
	private String tglName;				//唐古拉名称
	private String tglUserName;			//唐古拉账号
	private String devName;				//终端名称
	private String devAddr;				//终端地址
	private String svrName;				//服务器名称
	private String recordTime;			//收看时间
	private Integer subscribeCount;		//收看终端个数
	/**
	 * @return the devNo
	 */
	public String getDevNo() {
		return devNo;
	}
	/**
	 * @param devNo the devNo to set
	 */
	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}
	/**
	 * @return the tglName
	 */
	public String getTglName() {
		return tglName;
	}
	/**
	 * @param tglName the tglName to set
	 */
	public void setTglName(String tglName) {
		this.tglName = tglName;
	}
	/**
	 * @return the tglUserName
	 */
	public String getTglUserName() {
		return tglUserName;
	}
	/**
	 * @param tglUserName the tglUserName to set
	 */
	public void setTglUserName(String tglUserName) {
		this.tglUserName = tglUserName;
	}
	/**
	 * @return the devName
	 */
	public String getDevName() {
		return devName;
	}
	/**
	 * @param devName the devName to set
	 */
	public void setDevName(String devName) {
		this.devName = devName;
	}
	/**
	 * @return the devAddr
	 */
	public String getDevAddr() {
		return devAddr;
	}
	/**
	 * @param devAddr the devAddr to set
	 */
	public void setDevAddr(String devAddr) {
		this.devAddr = devAddr;
	}
	/**
	 * @return the svrName
	 */
	public String getSvrName() {
		return svrName;
	}
	/**
	 * @param svrName the svrName to set
	 */
	public void setSvrName(String svrName) {
		this.svrName = svrName;
	}
	/**
	 * @return the recordTime
	 */
	public String getRecordTime() {
		return recordTime;
	}
	/**
	 * @param recordTime the recordTime to set
	 */
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
	/**
	 * @return the subscribeCount
	 */
	public Integer getSubscribeCount() {
		return subscribeCount;
	}
	/**
	 * @param subscribeCount the subscribeCount to set
	 */
	public void setSubscribeCount(Integer subscribeCount) {
		this.subscribeCount = subscribeCount;
	}
	
	
}
