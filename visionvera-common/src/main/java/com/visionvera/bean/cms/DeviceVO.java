package com.visionvera.bean.cms;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: DeviceVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2016年9月14日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class DeviceVO implements Serializable {
	private static final long serialVersionUID = 1L;


	public DeviceVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String id;					//设备视联号码（主键）
	private String  msgId;				//主消息号（协转服务器号）
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
	private String pLayer;			    //gis 层级
	private String svrId;			    //设备所属服务器ID
	private String svrName;			    //设备所属服务器ID
	private String updateTime;			//设备信息更新时间
	private String regionId;			//设备所属行政节点ID
	private Integer no;
	private Integer streamType;         //大小流，1大流，0小流，默认大流
	private Integer status;         	//设备会议中的状态 0未在会议中 1在会议中
	private String address;             //设备地址
	private Integer dataType;           //数据属性：1默认，2私有
	private Integer devFunc;            //设备作用：0普通参会方，1主席，2发一，3发二
	private String systemTime;          //当前系统时间
	private String alostpacket;          //音频丢包率
	private String vlostpacket; 		//视频丢包率
	private String roleName;            //丢包率设备角色名称
	private String devno;				//5位设备号码
	private Integer online;			    //在线状态。0-不在线；1-在线
	private String zonedevno;      //12位设备号码
	private String zoneno;           //设备区号
	/**64位需求参数
	 * 虚拟终端子号码
	 */
	private String subVirId ;

	/**64位需求参数
	 * 监控UUID
	 */
	private String monitorUUID ;

	/**64位需求测试
	 * 设备会议中的状态 0未在会议中 1在会议中
	 */
	private Integer devStatus ;

	/**64位需要参数
	 * 用户设备昵称
	 */
	private String userDevAlias ;

	/**64位需求参数
	 * 行政区域级别
	 */
	private Integer gradeid;

	/**64位需求参数
	 * 主消息设备区号
	 */
	private String  mainZoneno;

	/**64位需求参数
	 * 主消息号码
	 */
	private String mainDevno;

	/**64位需求参数
	 * 主消息号唯一标识
	 */
	private String mainDevId;

	/**64位需求参数
	 * 监控绑定的虚拟号码
	 */
	private String virNo ;

	/**16位需求参数
	 * 设备数据来源
	 */
	private String svrRegionId;

	/**16位需求参数
	 * 终端业务状态
	 */
	private Integer operStatus;

	/**16位需求参数
	 * 终端业务开始时间
	 */
	private String startTime;

	/**16位需求参数
	 * 停止时间
	 */
	private String stopTime;

	/**16位需求参数
	 * 终端业务结束时间
	 */
	private String endTime;

	/**16位需求参数
	 * 设备唯一标识
	 */
	private String devId;

	/**16位需求参数
	 * 当前终端业务类型 1：遥控器业务 2：其他业务
	 */
	private Integer operType;

	/**16位需求参数
	 * 服务号（录播或直播）
	 */
	private String serverNo;

	/**16位需求参数
	 * 服务器返回虚拟终端号
	 */
	private String retrunVirNo;

	/**16位需求参数
	 * 业务id
	 */
	private String uuid;

	/**16位需求参数
	 * 会议名称
	 */
	private String meetName;

	/**16位需求参数
	 * 点播的视频名称
	 */
	private String videoName;

	/**16位需求参数
	 * 发一
	 */
	private String firstSpeaker;

	/**16位需求参数
	 * 主席号码
	 */
	private String masterId;

	/**64位需求参数
	 * 流媒体资源返回的用户节点ID。
	 */
	private String userId;

	/**64位需要参数
	 *	大写终端号
	 */
	private String devNo;

	/**
	 * 终端级别 is16or64
	 */
	private Integer deviceLevel;

	public Integer getDeviceLevel() {
		return deviceLevel;
	}

	public void setDeviceLevel(Integer deviceLevel) {
		this.deviceLevel = deviceLevel;
	}

	public String getDevNo() {
		return devNo;
	}

	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDevno() {
		return devno;
	}
	public void setDevno(String devno) {
		this.devno = devno;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getSvrName() {
		return svrName;
	}
	public void setSvrName(String svrName) {
		this.svrName = svrName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
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
	public String getAlostpacket() {
		return alostpacket;
	}
	public void setAlostpacket(String alostpacket) {
		this.alostpacket = alostpacket;
	}
	public String getVlostpacket() {
		return vlostpacket;
	}
	public void setVlostpacket(String vlostpacket) {
		this.vlostpacket = vlostpacket;
	}
	public Integer getOnline() {
		return online;
	}
	public void setOnline(Integer online) {
		this.online = online;
	}
	public String getpLayer() {
		return pLayer;
	}
	public void setpLayer(String pLayer) {
		this.pLayer = pLayer;
	}
	public String getZonedevno() {
		return zonedevno;
	}
	public void setZonedevno(String zonedevno) {
		this.zonedevno = zonedevno;
	}
	public String getZoneno() {
		return zoneno;
	}
	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}

	public String getSubVirId() {
		return subVirId;
	}

	public void setSubVirId(String subVirId) {
		this.subVirId = subVirId;
	}

	public String getMonitorUUID() {
		return monitorUUID;
	}

	public void setMonitorUUID(String monitorUUID) {
		this.monitorUUID = monitorUUID;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getDevStatus() {
		return devStatus;
	}

	public void setDevStatus(Integer devStatus) {
		this.devStatus = devStatus;
	}

	public String getUserDevAlias() {
		return userDevAlias;
	}

	public void setUserDevAlias(String userDevAlias) {
		this.userDevAlias = userDevAlias;
	}

	public Integer getGradeid() {
		return gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

	public String getMainZoneno() {
		return mainZoneno;
	}

	public void setMainZoneno(String mainZoneno) {
		this.mainZoneno = mainZoneno;
	}

	public String getMainDevno() {
		return mainDevno;
	}

	public void setMainDevno(String mainDevno) {
		this.mainDevno = mainDevno;
	}

	public String getMainDevId() {
		return mainDevId;
	}

	public void setMainDevId(String mainDevId) {
		this.mainDevId = mainDevId;
	}

	public String getVirNo() {
		return virNo;
	}

	public void setVirNo(String virNo) {
		this.virNo = virNo;
	}

	public String getSvrRegionId() {
		return svrRegionId;
	}

	public void setSvrRegionId(String svrRegionId) {
		this.svrRegionId = svrRegionId;
	}

	public Integer getOperStatus() {
		return operStatus;
	}

	public void setOperStatus(Integer operStatus) {
		this.operStatus = operStatus;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Integer getOperType() {
		return operType;
	}

	public void setOperType(Integer operType) {
		this.operType = operType;
	}

	public String getServerNo() {
		return serverNo;
	}

	public void setServerNo(String serverNo) {
		this.serverNo = serverNo;
	}

	public String getRetrunVirNo() {
		return retrunVirNo;
	}

	public void setRetrunVirNo(String retrunVirNo) {
		this.retrunVirNo = retrunVirNo;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getMeetName() {
		return meetName;
	}

	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getFirstSpeaker() {
		return firstSpeaker;
	}

	public void setFirstSpeaker(String firstSpeaker) {
		this.firstSpeaker = firstSpeaker;
	}

	public String getMasterId() {
		return masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
}
