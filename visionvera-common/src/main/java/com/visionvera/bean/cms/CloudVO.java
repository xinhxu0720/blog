package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @ClassName: DeviceVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2016年9月14日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class CloudVO {  //2019/2/20 周逸芳合并16位与64位代码时增加 原16位没有该实例

	public CloudVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String id;					//设备视联号码（主键，全局ID，全网唯一）
	private String devNo;					//设备视联号码（微云内终端号，不同微云内可重复）
	private Integer msgId;				//主消息号（协转服务器号）
	private Integer monitorId;			//监控ID
	private Integer channelId;			//通道号
	private String name; 				//设备名称
	private String mac;					//设备MAC
	private String ip;					//设备IP
	private String type;				//设备类型
	private Integer typeId;				//设备类型ID
	private String description;			//备注
	private String groupId;				//设备分组ID
	private String groupName;			//设备分组名
	private String alias;			    //设备别名
	private Integer roleId;			    //设备角色ID
	private String pX;			        //gis x坐标值
	private String pY;			        //gis y坐标值
	private String pZ;			        //gis z坐标值
	@JsonProperty("pLayer")
	private String pLayer;			    //gis 层级
	private String svrId;			    //设备所属服务器ID
	private String updateTime;			//设备信息更新时间
	private String regionId;			//设备所属行政节点ID
	private String no;
	private Integer streamType;         //大小流，1大流，0小流，默认大流
	private Integer status;         	//设备会议中的状态 0未在会议中 1在会议中
	private String address;             //设备地址
	private Integer dataType;           //数据属性：1默认，2私有
	private Integer devFunc;            //设备作用：0普通参会方，1主席，2发一，3发二
	private String systemTime;          //当前系统时间
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getpX() {
		return pX;
	}
	public void setpX(String pX) {
		this.pX = pX;
	}
	public String getpY() {
		return pY;
	}
	public void setpY(String pY) {
		this.pY = pY;
	}
	public String getpZ() {
		return pZ;
	}
	public void setpZ(String pZ) {
		this.pZ = pZ;
	}
	@JsonIgnore
	public String getPLayer() {
		return pLayer;
	}
	public void setPLayer(String pLayer) {
		this.pLayer = pLayer;
	}
	public String getSvrId() {
		return svrId;
	}
	public void setSvrId(String svrId) {
		this.svrId = svrId;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getMsgId() {
		return msgId;
	}
	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}
	public Integer getMonitorId() {
		return monitorId;
	}
	public void setMonitorId(Integer monitorId) {
		this.monitorId = monitorId;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Integer getStreamType() {
		return streamType;
	}
	public void setStreamType(Integer streamType) {
		this.streamType = streamType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDataType() {
		return dataType;
	}
	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}
	public Integer getDevFunc() {
		return devFunc;
	}
	public void setDevFunc(Integer devFunc) {
		this.devFunc = devFunc;
	}
	public String getSystemTime() {
		return systemTime;
	}
	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}
	public String getDevNo() {
		return devNo;
	}
	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}
	
	
	
}
