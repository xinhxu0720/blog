package com.visionvera.bean.slweoms;


/**
 * 平台进程Bean
 * @author dql
 *
 */
public class PlatformProcess {
	
	private Integer id;
	/**
	 * 展示名称
	 */
	private String showName;
	/**
	 * 进程名
	 */
	private String processName;
	
	/**
	 * 进程ip
	 */
	private String processIp;
	/**
	 * 端口号
	 */
	private String processPort;
	/**
	 * 进程状态,0正常，1异常
	 */
	private String processStatus;
	/**
	 * 操作系统
	 */
	private String operationSystem;
		/**
	 * 启动命令
	 */
	private String startScript;
	/**
	 * 启动脚本路径
	 */
	private String startScriptPath;
	/**
	 * 停止命令
	 */
	private String shutdownScript;
	/**
	 * 停止脚本路径
	 */
	private String shutdownScriptPath;
	/**
	 * 环境变量
	 */
	private String environmentVariables;
	/**
	 * 
	 */
	private String checkScript;
	
	/**
	 * 状态
	 */
	private Integer state;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	
	
	//扩展字段
	/**
	 * 平台唯一标识
	 */
	private String registerId;
	/**
	 * 平台名称
	 */
	private String platformName;
	
	/**
	 * 平台版本
	 */
	private String tposPlatformVersion;
	
	/**
	 * 平台类型名称
	 */
	private String platformTypeName;
	
	/**
	 * 平台类型
	 */
	private Integer platformType;
	/**
	 * 平台缩写
	 */
	private String abbreviation;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
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
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	
	public String getOperationSystem() {
		return operationSystem;
	}
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	public String getStartScript() {
		return startScript;
	}
	public void setStartScript(String startScript) {
		this.startScript = startScript;
	}
	public String getStartScriptPath() {
		return startScriptPath;
	}
	public void setStartScriptPath(String startScriptPath) {
		this.startScriptPath = startScriptPath;
	}
	public String getShutdownScript() {
		return shutdownScript;
	}
	public void setShutdownScript(String shutdownScript) {
		this.shutdownScript = shutdownScript;
	}
	public String getShutdownScriptPath() {
		return shutdownScriptPath;
	}
	public void setShutdownScriptPath(String shutdownScriptPath) {
		this.shutdownScriptPath = shutdownScriptPath;
	}
	public String getEnvironmentVariables() {
		return environmentVariables;
	}
	public void setEnvironmentVariables(String environmentVariables) {
		this.environmentVariables = environmentVariables;
	}
	public String getCheckScript() {
		return checkScript;
	}
	public void setCheckScript(String checkScript) {
		this.checkScript = checkScript;
	}
	public String getRegisterId() {
		return registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public String getTposPlatformVersion() {
		return tposPlatformVersion;
	}
	public void setTposPlatformVersion(String tposPlatformVersion) {
		this.tposPlatformVersion = tposPlatformVersion;
	}
	public String getPlatformTypeName() {
		return platformTypeName;
	}
	public void setPlatformTypeName(String platformTypeName) {
		this.platformTypeName = platformTypeName;
	}
	public Integer getPlatformType() {
		return platformType;
	}
	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
}
