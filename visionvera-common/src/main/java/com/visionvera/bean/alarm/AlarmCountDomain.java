package com.visionvera.bean.alarm;

/**
 * Created by shaow on 2018/6/6.各类型报警数量
 */
public class AlarmCountDomain {
    private Integer unHandledCount=0;//未处理报警数
    //private List<NameAndIntegerValueDomain> unHandlePair;//按维度分组后的未处理报警数
    //private List<NameAndIntegerValueDomain> totalPair;//按维度分组后的报警总数
    private Integer critical = 0;//故障
    private Integer majorCount=0;//报警数
    private Integer minorCount=0;//警告数
    private Integer warningCount=0;//注意数
    private Integer recentlyAlarmCount=0;//最近告警数
    private Integer trafficCount=0;//流量告警数
    private Integer deviceCount=0;//设备告警数
    private Integer businessCount=0;//业务告警数
    private Integer platformCount=0;//平台告警数
    private Integer unconfirmedCount=0;//未确认警数总数
    private Integer confirmedCount = 0;//已确认告警数量
    private Integer suspensionCount = 0;  //挂起告警数量

    private Integer trafficUnconfirmed = 0;  //流量未确认数量
    private Integer deviceUnconfirmed = 0;	//设备未确认数量
    private Integer businessUnconfirmed = 0;	//业务未确认数量
    private Integer platformUnconfirmed = 0;	//平台未确认数量
    private Integer trafficConfirmed = 0;   //流量处理中数量
    private Integer deviceConfirmed = 0;    //设备处理中数量
    private Integer businessConfirmed = 0;  //业务处理中数量
    private Integer platformConfirmed = 0;  //平台处理中数量
    private Integer trafficSuspension = 0;  //流量挂起数量
    private Integer deviceSuspension = 0;   //设备挂起数量
    private Integer businessSuspension = 0; //业务挂起数量
    private Integer platformSuspension = 0; //平台挂起数量
    
    public Integer getUnconfirmedCount() {
		return unconfirmedCount;
	}

	public void setUnconfirmedCount(Integer unconfirmedCount) {
		this.unconfirmedCount = unconfirmedCount;
	}
	
	public Integer getConfirmedCount() {
		return confirmedCount;
	}

	public void setConfirmedCount(Integer confirmedCount) {
		this.confirmedCount = confirmedCount;
	}

    public Integer getSuspensionCount() {
        return suspensionCount;
    }

    public void setSuspensionCount(Integer suspensionCount) {
        this.suspensionCount = suspensionCount;
    }

	public Integer getCritical() {
		return critical;
	}

	public void setCritical(Integer critical) {
		this.critical = critical;
	}

  /*  public List<NameAndIntegerValueDomain> getUnHandlePair() {
        return unHandlePair;
    }

    public void setUnHandlePair(List<NameAndIntegerValueDomain> unHandlePair) {
        this.unHandlePair = unHandlePair;
    }

    public List<NameAndIntegerValueDomain> getTotalPair() {
        return totalPair;
    }

    public void setTotalPair(List<NameAndIntegerValueDomain> totalPair) {
        this.totalPair = totalPair;
    }*/

    public Integer getUnHandledCount() {
        return unHandledCount;
    }

    public void setUnHandledCount(Integer unHandledCount) {
        this.unHandledCount = unHandledCount;
    }

    public Integer getMajorCount() {
        return majorCount;
    }

    public void setMajorCount(Integer majorCount) {
        this.majorCount = majorCount;
    }

    public Integer getMinorCount() {
        return minorCount;
    }

    public void setMinorCount(Integer minorCount) {
        this.minorCount = minorCount;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getRecentlyAlarmCount() {
        return recentlyAlarmCount;
    }

    public void setRecentlyAlarmCount(Integer recentlyAlarmCount) {
        this.recentlyAlarmCount = recentlyAlarmCount;
    }

    public Integer getTrafficCount() {
        return trafficCount;
    }

    public void setTrafficCount(Integer trafficCount) {
        this.trafficCount = trafficCount;
    }

    public Integer getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
    }

    public Integer getBusinessCount() {
        return businessCount;
    }

    public void setBusinessCount(Integer businessCount) {
        this.businessCount = businessCount;
    }

    public Integer getPlatformCount() {
        return platformCount;
    }

    public void setPlatformCount(Integer platformCount) {
        this.platformCount = platformCount;
    }

	public Integer getTrafficUnconfirmed() {
		return trafficUnconfirmed;
	}

	public void setTrafficUnconfirmed(Integer trafficUnconfirmed) {
		this.trafficUnconfirmed = trafficUnconfirmed;
	}

	public Integer getDeviceUnconfirmed() {
		return deviceUnconfirmed;
	}

	public void setDeviceUnconfirmed(Integer deviceUnconfirmed) {
		this.deviceUnconfirmed = deviceUnconfirmed;
	}

	public Integer getBusinessUnconfirmed() {
		return businessUnconfirmed;
	}

	public void setBusinessUnconfirmed(Integer businessUnconfirmed) {
		this.businessUnconfirmed = businessUnconfirmed;
	}

	public Integer getPlatformUnconfirmed() {
		return platformUnconfirmed;
	}

	public void setPlatformUnconfirmed(Integer platformUnconfirmed) {
		this.platformUnconfirmed = platformUnconfirmed;
	}

    public Integer getTrafficConfirmed() {
        return trafficConfirmed;
    }

    public void setTrafficConfirmed(Integer trafficConfirmed) {
        this.trafficConfirmed = trafficConfirmed;
    }

    public Integer getDeviceConfirmed() {
        return deviceConfirmed;
    }

    public void setDeviceConfirmed(Integer deviceConfirmed) {
        this.deviceConfirmed = deviceConfirmed;
    }

    public Integer getBusinessConfirmed() {
        return businessConfirmed;
    }

    public void setBusinessConfirmed(Integer businessConfirmed) {
        this.businessConfirmed = businessConfirmed;
    }

    public Integer getPlatformConfirmed() {
        return platformConfirmed;
    }

    public void setPlatformConfirmed(Integer platformConfirmed) {
        this.platformConfirmed = platformConfirmed;
    }

    public Integer getTrafficSuspension() {
        return trafficSuspension;
    }

    public void setTrafficSuspension(Integer trafficSuspension) {
        this.trafficSuspension = trafficSuspension;
    }

    public Integer getDeviceSuspension() {
        return deviceSuspension;
    }

    public void setDeviceSuspension(Integer deviceSuspension) {
        this.deviceSuspension = deviceSuspension;
    }

    public Integer getBusinessSuspension() {
        return businessSuspension;
    }

    public void setBusinessSuspension(Integer businessSuspension) {
        this.businessSuspension = businessSuspension;
    }

    public Integer getPlatformSuspension() {
        return platformSuspension;
    }

    public void setPlatformSuspension(Integer platformSuspension) {
        this.platformSuspension = platformSuspension;
    }
}
