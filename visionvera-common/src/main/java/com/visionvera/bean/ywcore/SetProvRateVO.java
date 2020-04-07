package com.visionvera.bean.ywcore;

import java.io.Serializable;

/**
 * 各省市县与主服务器之间的流量实体类
 * @author Bianjf
 *
 */
public class SetProvRateVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String regionId;						//行政区域ID
	
	private String prov;							//省名称
	
	private String upAllRate;						//总的上行流量，单位:Mb/s
	
	private String downAllRate;						//总的下行流量，单位:Mb/s
	
	private String life;							//是否是实时。now表示实时的，old表示上一刻的历史
	
	private String dateTime;						//收集数据的时间

	public SetProvRateVO() {
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
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

	public String getLife() {
		return life;
	}

	public void setLife(String life) {
		this.life = life;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}
