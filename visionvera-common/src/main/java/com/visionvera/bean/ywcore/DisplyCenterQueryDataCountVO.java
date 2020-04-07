package com.visionvera.bean.ywcore;

import java.util.Date;

/***
 * 展示中心查询统计数据VO
 * @author wangrz
 * @date 2018年6月14日
 *
 */
public class DisplyCenterQueryDataCountVO {
	
	/***
	 * 年月,格式：201806
	 */
	private String yearmonth;
	/***
	 * 行政id
	 */
	private String regionid;
	/***
	 * 统计数据类型
	 */
	private Integer dataflg;
	/***
	 * 月统计量
	 */
	private Integer monthcount;
	/***
	 * 第1周统计量
	 */
	private Integer weekcount1;
	/***
	 * 第2周统计量
	 */
	private Integer weekcount2;
	/***
	 * 第3周统计量
	 */
	private Integer weekcount3;
	/***
	 * 第4周统计量
	 */
	private Integer weekcount4;
	/***
	 * 第5周统计量
	 */
	private Integer weekcount5;
	/***
	 * 第6周统计量
	 */
	private Integer weekcount6;
	/***
	 * 更新时间
	 */
	private Date updatetime;
	public String getYearmonth() {
		return yearmonth;
	}
	public void setYearmonth(String yearmonth) {
		this.yearmonth = yearmonth;
	}
	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public Integer getDataflg() {
		return dataflg;
	}
	public void setDataflg(Integer dataflg) {
		this.dataflg = dataflg;
	}
	public Integer getMonthcount() {
		return monthcount;
	}
	public void setMonthcount(Integer monthcount) {
		this.monthcount = monthcount;
	}
	public Integer getWeekcount1() {
		return weekcount1;
	}
	public void setWeekcount1(Integer weekcount1) {
		this.weekcount1 = weekcount1;
	}
	public Integer getWeekcount2() {
		return weekcount2;
	}
	public void setWeekcount2(Integer weekcount2) {
		this.weekcount2 = weekcount2;
	}
	public Integer getWeekcount3() {
		return weekcount3;
	}
	public void setWeekcount3(Integer weekcount3) {
		this.weekcount3 = weekcount3;
	}
	public Integer getWeekcount4() {
		return weekcount4;
	}
	public void setWeekcount4(Integer weekcount4) {
		this.weekcount4 = weekcount4;
	}
	public Integer getWeekcount5() {
		return weekcount5;
	}
	public void setWeekcount5(Integer weekcount5) {
		this.weekcount5 = weekcount5;
	}
	public Integer getWeekcount6() {
		return weekcount6;
	}
	public void setWeekcount6(Integer weekcount6) {
		this.weekcount6 = weekcount6;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public DisplyCenterQueryDataCountVO() {
		super();
	}
}
