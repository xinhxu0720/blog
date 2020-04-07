package com.visionvera.bean.alarm.thirdParty.slweoms;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName: PlatformTposBean 
 * @Description: 第三方平台信息表
 * @author quboka
 * @date 2017年12月6日
 */
public class PlatformTposBean implements Serializable {
	private static final long serialVersionUID = -3350478841126904601L;
	
	private Integer tposId ;
	private Integer tposState;//状态 0 ：正常 -1：删除
	private Integer tposVersion;//版本号
	private Date tposCreatetime;//创建时间
	private Date tposModifytime;//修改时间
    private String serverUnique;// 服务器唯一标识
	private String tposUsername;//第三方平台的登陆账号
	private String tposPassword;//第三方平台的登陆密码
	private String tposRegisterid;//第三方平台的唯一标识
	private String tposName;//第三方平台的名称
	private String tposPhone;//第三方平台的联系电话
	private String tposLinkman;//第三方平台的联系人
	private String tposEmail;//第三方平台的邮箱
	private String tposAddress;//第三方平台的地址
	private Integer tposAddUserid;//第三方平台的添加人的id

	private String tposType;//第三方平台的类型   CMS：录播 ，v2vnms：网管，唐古拉：OSS，会馆：cmsweb 
	private Integer tposPlatformType ; //第三方平台种类  1：录播  2：网管 3：唐古拉 4：会馆
	private String tposIp ;// 第三方平台的ip

	private String tposAssetUrl;//第三方平台的资产查询接口
	private String tposAlarmUrl;//第三方平台的报警查询接口
	private Date tposAlarmTime;//第三方平台的报警查询时间
	private String tposCallBack;//第三方平台的回调接口
	private String tposLoginUrl;//第三方平台的登陆接口
	private String tposStatisticsUrl;//第三方平台的统计接口
	private String tposMonitorUrl;//第三方平台的监控接口
	private String tposExtend;//扩展字段

	private List<PlatformTposParamsBean> paramsBean; // 第三方平台参数
	
	private String tposPlatformVersion;//第三方平台的版本
	private String tposPlatformRegionbIds;//行政区id集合
	private Integer tposPlatformGradeid;//行政级别id
	private String tposPlatformRegionbName;//行政级名称


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getTposId() {
		return tposId;
	}

	public void setTposId(Integer tposId) {
		this.tposId = tposId;
	}

	public Integer getTposState() {
		return tposState;
	}

	public void setTposState(Integer tposState) {
		this.tposState = tposState;
	}

	public Integer getTposVersion() {
		return tposVersion;
	}

	public void setTposVersion(Integer tposVersion) {
		this.tposVersion = tposVersion;
	}

	public Date getTposCreatetime() {
		return tposCreatetime;
	}

	public void setTposCreatetime(Date tposCreatetime) {
		this.tposCreatetime = tposCreatetime;
	}

	public Date getTposModifytime() {
		return tposModifytime;
	}

	public void setTposModifytime(Date tposModifytime) {
		this.tposModifytime = tposModifytime;
	}

	public String getServerUnique() {
		return serverUnique;
	}

	public void setServerUnique(String serverUnique) {
		this.serverUnique = serverUnique;
	}

	public String getTposUsername() {
		return tposUsername;
	}

	public void setTposUsername(String tposUsername) {
		this.tposUsername = tposUsername;
	}

	public String getTposPassword() {
		return tposPassword;
	}

	public void setTposPassword(String tposPassword) {
		this.tposPassword = tposPassword;
	}

	public String getTposRegisterid() {
		return tposRegisterid;
	}

	public void setTposRegisterid(String tposRegisterid) {
		this.tposRegisterid = tposRegisterid;
	}

	public String getTposName() {
		return tposName;
	}

	public void setTposName(String tposName) {
		this.tposName = tposName;
	}

	public String getTposPhone() {
		return tposPhone;
	}

	public void setTposPhone(String tposPhone) {
		this.tposPhone = tposPhone;
	}

	public String getTposLinkman() {
		return tposLinkman;
	}

	public void setTposLinkman(String tposLinkman) {
		this.tposLinkman = tposLinkman;
	}

	public String getTposEmail() {
		return tposEmail;
	}

	public void setTposEmail(String tposEmail) {
		this.tposEmail = tposEmail;
	}

	public String getTposAddress() {
		return tposAddress;
	}

	public void setTposAddress(String tposAddress) {
		this.tposAddress = tposAddress;
	}

	public Integer getTposAddUserid() {
		return tposAddUserid;
	}

	public void setTposAddUserid(Integer tposAddUserid) {
		this.tposAddUserid = tposAddUserid;
	}

	public String getTposType() {
		return tposType;
	}

	public void setTposType(String tposType) {
		this.tposType = tposType;
	}

	public Integer getTposPlatformType() {
		return tposPlatformType;
	}

	public void setTposPlatformType(Integer tposPlatformType) {
		this.tposPlatformType = tposPlatformType;
	}

	public String getTposIp() {
		return tposIp;
	}

	public void setTposIp(String tposIp) {
		this.tposIp = tposIp;
	}

	public String getTposAssetUrl() {
		return tposAssetUrl;
	}

	public void setTposAssetUrl(String tposAssetUrl) {
		this.tposAssetUrl = tposAssetUrl;
	}

	public String getTposAlarmUrl() {
		return tposAlarmUrl;
	}

	public void setTposAlarmUrl(String tposAlarmUrl) {
		this.tposAlarmUrl = tposAlarmUrl;
	}

	public Date getTposAlarmTime() {
		return tposAlarmTime;
	}

	public void setTposAlarmTime(Date tposAlarmTime) {
		this.tposAlarmTime = tposAlarmTime;
	}

	public String getTposCallBack() {
		return tposCallBack;
	}

	public void setTposCallBack(String tposCallBack) {
		this.tposCallBack = tposCallBack;
	}

	public String getTposLoginUrl() {
		return tposLoginUrl;
	}

	public void setTposLoginUrl(String tposLoginUrl) {
		this.tposLoginUrl = tposLoginUrl;
	}

	public String getTposStatisticsUrl() {
		return tposStatisticsUrl;
	}

	public void setTposStatisticsUrl(String tposStatisticsUrl) {
		this.tposStatisticsUrl = tposStatisticsUrl;
	}

	public String getTposMonitorUrl() {
		return tposMonitorUrl;
	}

	public void setTposMonitorUrl(String tposMonitorUrl) {
		this.tposMonitorUrl = tposMonitorUrl;
	}

	public String getTposExtend() {
		return tposExtend;
	}

	public void setTposExtend(String tposExtend) {
		this.tposExtend = tposExtend;
	}

	public List<PlatformTposParamsBean> getParamsBean() {
		return paramsBean;
	}

	public void setParamsBean(List<PlatformTposParamsBean> paramsBean) {
		this.paramsBean = paramsBean;
	}

	public String getTposPlatformVersion() {
		return tposPlatformVersion;
	}

	public void setTposPlatformVersion(String tposPlatformVersion) {
		this.tposPlatformVersion = tposPlatformVersion;
	}

	public String getTposPlatformRegionbIds() {
		return tposPlatformRegionbIds;
	}

	public void setTposPlatformRegionbIds(String tposPlatformRegionbIds) {
		this.tposPlatformRegionbIds = tposPlatformRegionbIds;
	}

	public Integer getTposPlatformGradeid() {
		return tposPlatformGradeid;
	}

	public void setTposPlatformGradeid(Integer tposPlatformGradeid) {
		this.tposPlatformGradeid = tposPlatformGradeid;
	}

	public String getTposPlatformRegionbName() {
		return tposPlatformRegionbName;
	}

	public void setTposPlatformRegionbName(String tposPlatformRegionbName) {
		this.tposPlatformRegionbName = tposPlatformRegionbName;
	}
}
