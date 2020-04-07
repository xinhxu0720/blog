package com.visionvera.bean.slweoms;

import java.util.Date;

/**
 * 平台
 * @author dql
 *
 */
public class PlatformVO {
	
	private Integer tposId;    //平台id
	private String tposRegisterid;		//平台注册唯一标识
	private String tposName;		//平台名称
	private Integer tposPlatformType;	//平台类型
	private String platformName;	//平台类型名称
	private String abbreviation;	//平台类型缩写
	private String tposIp;	//平台ip和端口
	private String tposPlatformVersion;	//平台版本
	private String tposLinkman;		//平台联系人
	private String tposPhone;		//平台联系人电话
	private String tposEmail;		//平台联系人邮箱
	private Integer tposProcessState;  //平台进程状态 0正常，1异常
	private String serverUnique;	 //服务器唯一标识
	private Date tposCreatetime;	//平台创建时间
	private Date tposModifytime;	//平台修改时间
	private Integer tposState;		//平台状态 0正常，-1删除

	/**
	 * 是否检测配置文件
	 */
	private Integer confCheck;
	/**
	 * 配置文件修改时间，多个用逗号分隔
	 */
	private String confCheckTime;

	/**
	 * 平台配置是否检测 0：否，1：是
	 */
	private Integer versionCheck;
	/**
	 * 探针传输协议协议
	 */
	private String transferType;
	
	/**
	 *进程扩展字段
	 */
	private Integer processId;
	
	private String showName;
	
	private String processIp;
	
	private String processPort;
	
	
	public Integer getTposId() {
		return tposId;
	}
	public void setTposId(Integer tposId) {
		this.tposId = tposId;
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

	public Integer getTposPlatformType() {
		return tposPlatformType;
	}

	public void setTposPlatformType(Integer tposPlatformType) {
		this.tposPlatformType = tposPlatformType;
	}


	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getTposIp() {
		return tposIp;
	}
	public void setTposIp(String tposIp) {
		this.tposIp = tposIp;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getTposPlatformVersion() {
		return tposPlatformVersion;
	}
	public void setTposPlatformVersion(String tposPlatformVersion) {
		this.tposPlatformVersion = tposPlatformVersion;
	}
	
	public String getTposLinkman() {
		return tposLinkman;
	}
	public void setTposLinkman(String tposLinkman) {
		this.tposLinkman = tposLinkman;
	}
	
	public String getTposPhone() {
		return tposPhone;
	}
	public void setTposPhone(String tposPhone) {
		this.tposPhone = tposPhone;
	}
	
	public String getTposEmail() {
		return tposEmail;
	}
	public void setTposEmail(String tposEmail) {
		this.tposEmail = tposEmail;
	}
	
	public Integer getTposProcessState() {
		return tposProcessState;
	}
	public void setTposProcessState(Integer tposProcessState) {
		this.tposProcessState = tposProcessState;
	}
	
	public String getServerUnique() {
		return serverUnique;
	}
	public void setServerUnique(String serverUnique) {
		this.serverUnique = serverUnique;
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
	
	public Integer getTposState() {
		return tposState;
	}
	public void setTposState(Integer tposState) {
		this.tposState = tposState;
	}

	public Integer getConfCheck() {
		return confCheck;
	}

	public void setConfCheck(Integer confCheck) {
		this.confCheck = confCheck;
	}

	public String getConfCheckTime() {
		return confCheckTime;
	}

	public void setConfCheckTime(String confCheckTime) {
		this.confCheckTime = confCheckTime;
	}

	public Integer getVersionCheck() {
		return versionCheck;
	}

	public void setVersionCheck(Integer versionCheck) {
		this.versionCheck = versionCheck;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public Integer getProcessId() {
		return processId;
	}
	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getProcessIp() {
		return processIp;
	}
	public void setProcessIp(String processIp) {
		this.processIp = processIp;
	}
	public String getProcessPort() {
		return processPort;
	}
	public void setProcessPort(String processPort) {
		this.processPort = processPort;
	}
	
}
