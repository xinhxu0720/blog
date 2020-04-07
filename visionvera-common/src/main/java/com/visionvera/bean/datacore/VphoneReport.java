package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


/**
 * <p>
 *
 * </p>
 *
 * @author zhanghui
 * @since 2018-11-22
 */

public class VphoneReport implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 业务唯一ID
	 */
	private String uniqId;
	/**
	 * 源终端号码
	 */
	private String srcNo;
	/**
	 * 终端唯一ID
	 */
	private String srcDevId;
	/**
	 * 源终端区号
	 */
	private String srcZoneno;
	/**
	 * 源终端8位设备号码
	 */
	private String srcZonedevno;
	/**
	 * 源终端所在的行政区域ID
	 */
	private String srcRegionId;
	/**
	 * 源终端MAC
	 */
	private String srcMac;
	/**
	 * 源终端名称
	 */
	private String srcName;
	/**
	 * 源终端地址
	 */
	private String srcAddr;
	/**
	 * 目的终端号码
	 */
	private String dstNo;
	/**
	 * 目的设备唯一ID
	 */
	private String dstDevId;
	/**
	 * 目的终端区号
	 */
	private String dstZoneno;
	/**
	 * 目的8位终端号码
	 */
	private String dstZonedevno;
	/**
	 * 目的终端所在的行政区域ID
	 */
	private String dstRegionId;
	/**
	 * 目的终端MAC
	 */
	private String dstMac;
	/**
	 * 目的终端名称
	 */
	private String dstName;
	/**
	 * 目的终端地址
	 */
	private String dstAddr;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * 端口
	 */
	private Integer port;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 拨打可视电话的用户
	 */
	private String userName;
	/**
	 * 业务模式： 0 主动发起；1 被动发起（只适用终端）
	 */
	private Integer businessMode;
	/**
	 * 业务类型：0 可视电话；1 发布直播（普通）；2 发布直播（监控）；3 发布直播（升级）；4 收看直播（普通）；5 收看直播（监控）；6 收看直播（升级）； 7 录制； 8 点播
	 */
	private Integer businessType;
	/**
	 * 业务状态：0 开始； 1 停止（2 异常停止）
	 */
	private Integer businessState;
	/**
	 * 上报业务的平台类型：301 唐古拉； 401 流媒体web平台； 501 内容管理平台
	 */
	private Integer platformType;
	/**
	 * 上报业务的平台ID（唯一标志）
	 */
	private String platformId;
	/**
	 * 创建时间
	 */
	private Date creatTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 是否允许业务开启： 0 允许；1 不允许
	 */
	private Integer busCode;
	/**
	 * 校验业务结果
	 */
	private String busMsg;
	/**
	 * 是否删除(0未删除 1已删除 )
	 */
	private Integer isDel;
	/**
	 * 扩展字段1
	 */
	private String extAttr1;
	/**
	 * 扩展字段2
	 */
	private String extAttr2;
	/**
	 * 扩展字段3
	 */
	private String extAttr3;
	/**
	 * 扩展字段4
	 */
	private String extAttr4;

	/**
	 * 开始时间或者结束时间
	 */
	private String time;


	public String getUniqId() {
		return uniqId;
	}
	public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}
	public String getSrcNo() {
		return srcNo;
	}
	public void setSrcNo(String srcNo) {
		this.srcNo = srcNo;
	}
	public String getSrcDevId() {
		return srcDevId;
	}
	public void setSrcDevId(String srcDevId) {
		this.srcDevId = srcDevId;
	}
	public String getSrcMac() {
		return srcMac;
	}
	public void setSrcMac(String srcMac) {
		this.srcMac = srcMac;
	}
	public String getSrcName() {
		return srcName;
	}
	public void setSrcName(String srcName) {
		this.srcName = srcName;
	}
	public String getSrcAddr() {
		return srcAddr;
	}
	public void setSrcAddr(String srcAddr) {
		this.srcAddr = srcAddr;
	}
	public String getDstNo() {
		return dstNo;
	}
	public void setDstNo(String dstNo) {
		this.dstNo = dstNo;
	}
	public String getDstMac() {
		return dstMac;
	}
	public void setDstMac(String dstMac) {
		this.dstMac = dstMac;
	}
	public String getDstName() {
		return dstName;
	}
	public void setDstName(String dstName) {
		this.dstName = dstName;
	}
	public String getDstAddr() {
		return dstAddr;
	}
	public void setDstAddr(String dstAddr) {
		this.dstAddr = dstAddr;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getBusinessMode() {
		return businessMode;
	}
	public void setBusinessMode(Integer businessMode) {
		this.businessMode = businessMode;
	}
	public Integer getBusinessType() {
		return businessType;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	public Integer getBusinessState() {
		return businessState;
	}
	public void setBusinessState(Integer businessState) {
		this.businessState = businessState;
	}
	public Integer getPlatformType() {
		return platformType;
	}
	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getBusCode() {
		return busCode;
	}
	public void setBusCode(Integer busCode) {
		this.busCode = busCode;
	}
	public String getBusMsg() {
		return busMsg;
	}
	public void setBusMsg(String busMsg) {
		this.busMsg = busMsg;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public String getExtAttr1() {
		return extAttr1;
	}
	public void setExtAttr1(String extAttr1) {
		this.extAttr1 = extAttr1;
	}
	public String getExtAttr2() {
		return extAttr2;
	}
	public void setExtAttr2(String extAttr2) {
		this.extAttr2 = extAttr2;
	}
	public String getExtAttr3() {
		return extAttr3;
	}
	public void setExtAttr3(String extAttr3) {
		this.extAttr3 = extAttr3;
	}
	public String getExtAttr4() {
		return extAttr4;
	}
	public void setExtAttr4(String extAttr4) {
		this.extAttr4 = extAttr4;
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSrcZoneno() {
		return srcZoneno;
	}
	public void setSrcZoneno(String srcZoneno) {
		this.srcZoneno = srcZoneno;
	}
	public String getSrcZonedevno() {
		return srcZonedevno;
	}
	public void setSrcZonedevno(String srcZonedevno) {
		this.srcZonedevno = srcZonedevno;
	}
	public String getDstDevId() {
		return dstDevId;
	}
	public void setDstDevId(String dstDevId) {
		this.dstDevId = dstDevId;
	}
	public String getDstZoneno() {
		return dstZoneno;
	}
	public void setDstZoneno(String dstZoneno) {
		this.dstZoneno = dstZoneno;
	}
	public String getDstZonedevno() {
		return dstZonedevno;
	}
	public void setDstZonedevno(String dstZonedevno) {
		this.dstZonedevno = dstZonedevno;
	}
	public String getSrcRegionId() {
		return srcRegionId;
	}
	public void setSrcRegionId(String srcRegionId) {
		this.srcRegionId = srcRegionId;
	}
	public String getDstRegionId() {
		return dstRegionId;
	}
	public void setDstRegionId(String dstRegionId) {
		this.dstRegionId = dstRegionId;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof VphoneReport)) return false;
		VphoneReport that = (VphoneReport) o;
		return Objects.equals(getSrcNo(), that.getSrcNo()) &&
				Objects.equals(getSrcAddr(), that.getSrcAddr()) &&
				Objects.equals(getBusinessType(), that.getBusinessType()) &&
				Objects.equals(getBusinessState(), that.getBusinessState()) &&
				Objects.equals(getPlatformType(), that.getPlatformType()) &&
				Objects.equals(getPlatformId(), that.getPlatformId()) &&
				Objects.equals(getTime(), that.getTime());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getSrcNo(), getSrcAddr(), getBusinessType(), getBusinessState(), getPlatformType(), getPlatformId(), getTime());
	}

	@Override
	public String toString() {
		return "VphoneReport{" +
			   "uniqId=" + uniqId +
			   ", srcNo=" + srcNo +
			   ", srcMac=" + srcMac +
			   ", srcName=" + srcName +
			   ", srcAddr=" + srcAddr +
			   ", dstNo=" + dstNo +
			   ", dstMac=" + dstMac +
			   ", dstName=" + dstName +
			   ", dstAddr=" + dstAddr +
			   ", ip=" + ip +
			   ", port=" + port +
			   ", startTime=" + startTime +
			   ", endTime=" + endTime +
			   ", userName=" + userName +
			   ", businessMode=" + businessMode +
			   ", businessType=" + businessType +
			   ", businessState=" + businessState +
			   ", platformType=" + platformType +
			   ", platformId=" + platformId +
			   ", creatTime=" + creatTime +
			   ", updateTime=" + updateTime +
			   ", isDel=" + isDel +
			   ", extAttr1=" + extAttr1 +
			   ", extAttr2=" + extAttr2 +
			   ", extAttr3=" + extAttr3 +
			   ", extAttr4=" + extAttr4 +
			"}";
	}
}
