package com.visionvera.bean.cms;

import java.util.List;

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
public class DispModeVO {

	public DispModeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String deviceId;			//20位设备视联号码（主键）2019/2/20 周逸芳合并16位与64位代码时修改 16位为Integer 64位为String
	private Integer dispMode;           //终端显示模式。0-"主输出显示，一画面"；1-"主输出显示，大小屏"；2:"主输出显示，两分屏"；3"主输出显示，四画面"；4"大小屏，大：发，小：本"；
										//5:"大小屏，大：发，小： 辅"；6"大小屏，大：辅流，小：发"；7"双屏显示，左：发，右：本地"；8"双屏显示，左： 发，右：辅流"；9"双屏显示，左：辅流，右：发"
	private Boolean hdmi;               //终端显示类型。true：HDMI；false：DVI
	private Boolean save;               //是否保存配置文件，true 是；false 否
	private List<String> deviceIdList;  //2019/2/20 周逸芳合并16位与64位代码时修改 16位为Integer 64位为String
	
	private Integer screenNum;  		//分屏数量
    private Integer audioNum;   		//音频数
    private String audio;  				//音频列表	  想要听的终端声音+通道。格式为10071,0;以分号分割
    private String video;   			//视频列表	   显示的终端号码+通道。格式为 10071,0;以分号分割
    private Integer outPutMode;			//视频输出类型  1.dvi   2.hdmi  默认为1
	private String zoneno;				//设备区域号码
	private String uuid;				//设备的唯一标识
	private String virtualNo;			//虚拟终端号码
	private String devices;				//终端列表用;分割


	
	public List<String> getDeviceIdList() {
		return deviceIdList;
	}
	public void setDeviceIdList(List<String> deviceIdList) {
		this.deviceIdList = deviceIdList;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public Integer getDispMode() {
		return dispMode;
	}
	public void setDispMode(Integer dispMode) {
		this.dispMode = dispMode;
	}
	public boolean getSave() {
		return save;
	}
	public void setSave(boolean save) {
		this.save = save;
	}
	public Integer getScreenNum() {
		return screenNum;
	}
	public void setScreenNum(Integer screenNum) {
		this.screenNum = screenNum;
	}
	public Integer getAudioNum() {
		return audioNum;
	}
	public void setAudioNum(Integer audioNum) {
		this.audioNum = audioNum;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Integer getOutPutMode() {
		return outPutMode;
	}
	public void setOutPutMode(Integer outPutMode) {
		this.outPutMode = outPutMode;
	}
	public String getZoneno() {
		return zoneno;
	}
	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getVirtualNo() {
		return virtualNo;
	}
	public void setVirtualNo(String virtualNo) {
		this.virtualNo = virtualNo;
	}

	public Boolean getHdmi() {
		return hdmi;
	}

	public void setHdmi(Boolean hdmi) {
		this.hdmi = hdmi;
	}

	public void setSave(Boolean save) {
		this.save = save;
	}

	public String getDevices() {
		return devices;
	}

	public void setDevices(String devices) {
		this.devices = devices;
	}
}
