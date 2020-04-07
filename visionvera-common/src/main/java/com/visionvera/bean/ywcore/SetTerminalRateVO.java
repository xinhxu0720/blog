package com.visionvera.bean.ywcore;

import java.io.Serializable;

/**
 * 旧的终端(实际上是路由的意思)的流量实体类
 * @author Bianjf
 *
 */
public class SetTerminalRateVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dateTime;							//日期时间

	private String bit;									//系统位数，是16位还是64位

	private String terminalRegion;						//源终端RegionID

	private String terminalDevno;						//源终端号码

	private String terminalMac;							//源终端的MAC

	private String direction;							//方向。up表示上行，down表示下行

	private String terminal;							//源终端名称

	private String fromProv;							//源终端所在的省份

	private String dName;								//目的终端名称

	private String toProv;								//目的终端所在的省份

	private String businessType;						//业务类型

	private String allRate;								//总流量，单位:Mb/s

	private String life;								//是否是实时。now表示实时的，old表示上一刻的历史

	/** 以下是扩展字段 */
	private String upAllRate;							//总的上行流量，单位:Mb/s

	private String downAllRate;							//总的下行流量，单位:Mb/s

	private String regionId;							//行政区域ID

	private String destDevno;							//目的终端号码

	private String zonecode;							//八位终端号码

	private String fromprovid;							//源区域号码

	private String toprovid;							//目的区域号码

	public SetTerminalRateVO() {
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getBit() {
		return bit;
	}

	public void setBit(String bit) {
		this.bit = bit;
	}

	public String getTerminalRegion() {
		return terminalRegion;
	}

	public void setTerminalRegion(String terminalRegion) {
		this.terminalRegion = terminalRegion;
	}

	public String getTerminalDevno() {
		return terminalDevno;
	}

	public void setTerminalDevno(String terminalDevno) {
		this.terminalDevno = terminalDevno;
	}

	public String getTerminalMac() {
		return terminalMac;
	}

	public void setTerminalMac(String terminalMac) {
		this.terminalMac = terminalMac;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getFromProv() {
		return fromProv;
	}

	public void setFromProv(String fromProv) {
		this.fromProv = fromProv;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getToProv() {
		return toProv;
	}

	public void setToProv(String toProv) {
		this.toProv = toProv;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getAllRate() {
		return allRate;
	}

	public void setAllRate(String allRate) {
		this.allRate = allRate;
	}

	public String getUpAllRate() {
		return upAllRate;
	}

	public void setUpAllRate(String upAllRate) {
		this.upAllRate = upAllRate;
	}

	public String getDownAllRate() {
		return downAllRate;
	}

	public void setDownAllRate(String downAllRate) {
		this.downAllRate = downAllRate;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getLife() {
		return life;
	}

	public void setLife(String life) {
		this.life = life;
	}

	public String getDestDevno() {
		return destDevno;
	}

	public void setDestDevno(String destDevno) {
		this.destDevno = destDevno;
	}

	public String getZonecode() {
		return zonecode;
	}

	public void setZonecode(String zonecode) {
		this.zonecode = zonecode;
	}

	public String getFromprovid() {
		return fromprovid;
	}

	public void setFromprovid(String fromprovid) {
		this.fromprovid = fromprovid;
	}

	public String getToprovid() {
		return toprovid;
	}

	public void setToprovid(String toprovid) {
		this.toprovid = toprovid;
	}
}
