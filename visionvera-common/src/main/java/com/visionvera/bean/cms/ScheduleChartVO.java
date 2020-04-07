/**   
 * @Title: PhoneVO.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:27:36 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

/** 
 * @ClassName: PhoneVO 
 * @Description: TODO 用户角色实体 
 * @author xiechs
 * @date 2016年12月5日 
 *  
 */
public class ScheduleChartVO {
	private String scheduleId;  		//会议ID（主键）
	private String chartId;  		    //群聊ID
	private String createTime; 		    //创建时间
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getChartId() {
		return chartId;
	}
	public void setChartId(String chartId) {
		this.chartId = chartId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
