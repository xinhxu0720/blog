package com.visionvera.enums;

/**
 * 业务信息业务中，返回给前端的Key
 * @author Bianjf
 *
 */
public enum BusinessInfoKeyEnum {
	/** 地图业务数据导航的key: mapNavigation */
	mapNavigation("地图业务数据导航的key"),
	/** 终端最大的业务量TOP5的key: maxBusinessCountTopFive */
	maxBusinessCountTopFive("终端最大的业务量TOP5的key"),
	/** 年度趋势的key: annualTrend */
	annualTrend("年度趋势的key"),
	/** 行业分布的key: industryDistribution */
	industryDistribution("行业分布的key"),
	/** 业务调用排行TOP10的key: businessTopTen */
	businessTopTen("业务调用排行TOP10的key"),
	/** 项目调用TOP5的key: projectTopFive */
	projectTopFive("项目调用TOP5的key"),
	/** 业务信息的标题的Key: other */
	other("业务信息的标题的Key");
	
	private String desc;

	private BusinessInfoKeyEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
