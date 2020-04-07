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
 * @since 2018-11-21
 */

public class MonitorVedioReport implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 业务唯一ID
	 */
	private String uniqId;
	/**
	 * 虚拟终端号
	 */
	private String virtualNo;
	/**
	 * 虚拟终端名称
	 */
	private String virtualName;
	/**
	 * 虚拟终端地址
	 */
	private String virtualAddr;
	/**
	 * 视频名称
	 */
	private String vedioName;
	/**
	 * 协转主消息号
	 */
	private String msgNo;
	/**
	 * 终端号码
	 */
	private String devNo;
	/**
	 * 终端唯一ID
	 */
	private String devId;
	/**
	 * 设备区号
	 */
	private String zoneno;
	/**
	 * 8位设备号码
	 */
	private String zonedevno;
	/**
	 * 终端名称
	 */
	private String devName;
	/**
	 * 终端位置
	 */
	private String devAddr;
	/**
	 * 设备所在的区域ID
	 */
	private String devRegionId;
	/**
	 * 终端MAC
	 */
	private String devMac;
	/**
	 * 协转所属服务器名称
	 */
	private String svrName;
	/**
	 * 协转所属服务器名称
	 */
	private String svrAddr;
	/**
	 * 终端个数
	 */
	private Integer subscribeCount;
	/**
	 * 录制类型：0 会议； 1 监控
	 */
	private Integer recordType;
	/**
	 * 录制内容：xx会议，xx监控等
	 */
	private String recordContent;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * 端口
	 */
	private Integer port;
	/**
	 * 监控id
	 */
	private String monitorId;
	/**
	 * 终端群组id
	 */
	private String devgroupId;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 发布、收看、录制、点播的用户
	 */
	private String userName;
	/**
	 * 正在升级的文件名称
	 */
	private String filename;
	/**
	 * 正在升级的文件大小
	 */
	private String filesize;
	/**
	 * 正在升级的版本号
	 */
	private String fileversion;
	/**
	 * 正在升级的文件类型名称
	 */
	private String filetypename;
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
	
	/**扩展字段开始*/
	private String time;//上报时间 
	
	private String meetName;//会议名称
	
	private String devs;//参会终端列表，格式：号码,MAC;号码,MAC
	
	private String searchWord;//搜索关键字
	
	private String firstSpeaker;//发一
	
	private String msgNoZoneNo;			//主消息号的区号
	
	private String zoneMsgNo;			//主消息号的8位号码
	
	private String msgNoRegionId;		//主消息号所在的区域ID
	
	private String virtualNoZoneNo;		//虚拟号的区号
	
	private String zoneVirtualNo;		//虚拟号的8位设备号
	
	private String virtualNoRegionId;	//虚拟号所在的区域ID
	
	private Integer stopStatus;//停止业务的方式状态
	
    private Integer Id;//唐古拉上报平台的主键
	
	/**扩展字段结束*/
	
	public String getUniqId() {
		return uniqId;
	}
	public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}
	public String getVirtualNo() {
		return virtualNo;
	}
	public void setVirtualNo(String virtualNo) {
		this.virtualNo = virtualNo;
	}
	public String getVedioName() {
		return vedioName;
	}
	public void setVedioName(String vedioName) {
		this.vedioName = vedioName;
	}
	public String getMsgNo() {
		return msgNo;
	}
	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
	}
	public String getDevNo() {
		return devNo;
	}
	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}
	public String getDevId() {
		return devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevAddr() {
		return devAddr;
	}
	public void setDevAddr(String devAddr) {
		this.devAddr = devAddr;
	}
	public String getDevRegionId() {
		return devRegionId;
	}
	public void setDevRegionId(String devRegionId) {
		this.devRegionId = devRegionId;
	}
	public String getDevMac() {
		return devMac;
	}
	public void setDevMac(String devMac) {
		this.devMac = devMac;
	}
	public String getSvrName() {
		return svrName;
	}
	public void setSvrName(String svrName) {
		this.svrName = svrName;
	}
	public String getSvrAddr() {
		return svrAddr;
	}
	public void setSvrAddr(String svrAddr) {
		this.svrAddr = svrAddr;
	}
	public Integer getSubscribeCount() {
		return subscribeCount;
	}
	public void setSubscribeCount(Integer subscribeCount) {
		this.subscribeCount = subscribeCount;
	}
	public Integer getRecordType() {
		return recordType;
	}
	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
	}
	public String getRecordContent() {
		return recordContent;
	}
	public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
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
	public String getMonitorId() {
		return monitorId;
	}
	public void setMonitorId(String monitorId) {
		this.monitorId = monitorId;
	}
	public String getDevgroupId() {
		return devgroupId;
	}
	public void setDevgroupId(String devgroupId) {
		this.devgroupId = devgroupId;
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
	public String getMeetName() {
		return meetName;
	}
	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}
	public String getDevs() {
		return devs;
	}
	public void setDevs(String devs) {
		this.devs = devs;
	}
	
	public String getZoneno() {
		return zoneno;
	}
	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}
	public String getZonedevno() {
		return zonedevno;
	}
	public void setZonedevno(String zonedevno) {
		this.zonedevno = zonedevno;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	public String getFileversion() {
		return fileversion;
	}
	public void setFileversion(String fileversion) {
		this.fileversion = fileversion;
	}
	public String getFiletypename() {
		return filetypename;
	}
	public void setFiletypename(String filetypename) {
		this.filetypename = filetypename;
	}
	
	public String getVirtualName() {
		return virtualName;
	}
	public void setVirtualName(String virtualName) {
		this.virtualName = virtualName;
	}
	public String getVirtualAddr() {
		return virtualAddr;
	}
	public void setVirtualAddr(String virtualAddr) {
		this.virtualAddr = virtualAddr;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public String getFirstSpeaker() {
		return firstSpeaker;
	}
	public void setFirstSpeaker(String firstSpeaker) {
		this.firstSpeaker = firstSpeaker;
	}
	public String getMsgNoZoneNo() {
		return msgNoZoneNo;
	}
	public void setMsgNoZoneNo(String msgNoZoneNo) {
		this.msgNoZoneNo = msgNoZoneNo;
	}
	public String getZoneMsgNo() {
		return zoneMsgNo;
	}
	public void setZoneMsgNo(String zoneMsgNo) {
		this.zoneMsgNo = zoneMsgNo;
	}
	public String getMsgNoRegionId() {
		return msgNoRegionId;
	}
	public void setMsgNoRegionId(String msgNoRegionId) {
		this.msgNoRegionId = msgNoRegionId;
	}
	public String getVirtualNoZoneNo() {
		return virtualNoZoneNo;
	}
	public void setVirtualNoZoneNo(String virtualNoZoneNo) {
		this.virtualNoZoneNo = virtualNoZoneNo;
	}
	public String getZoneVirtualNo() {
		return zoneVirtualNo;
	}
	public void setZoneVirtualNo(String zoneVirtualNo) {
		this.zoneVirtualNo = zoneVirtualNo;
	}
	public String getVirtualNoRegionId() {
		return virtualNoRegionId;
	}
	public void setVirtualNoRegionId(String virtualNoRegionId) {
		this.virtualNoRegionId = virtualNoRegionId;
	}
	public Integer getStopStatus() {
		return stopStatus;
	}
	public void setStopStatus(Integer stopStatus) {
		this.stopStatus = stopStatus;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
    public String toString() {
        return "MonitorVedioReport{" +
                "uniqId=" + uniqId +
                ", virtualNo=" + virtualNo +
                ", vedioName=" + vedioName +
                ", msgNo=" + msgNo +
                ", devNo=" + devNo +
                ", devName=" + devName +
                ", devAddr=" + devAddr +
                ", devMac=" + devMac +
                ", svrName=" + svrName +
                ", subscribeCount=" + subscribeCount +
                ", recordType=" + recordType +
                ", recordContent=" + recordContent +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorVedioReport)) {
            return false;
        }
        MonitorVedioReport that = (MonitorVedioReport) o;
        return Objects.equals(getUniqId().split(",")[0], that.getUniqId().split(",")[0]) &&
                Objects.equals(getPlatformType(), that.getPlatformType());
    }
}
