package com.visionvera.bean.slweoms;

/**
 * 应用服务器与最新硬件信息关系维护
 * @author dql714099655
 *
 */
public class ServerHardwareRelation {
	
	private String serverUnique;
	
	private Long hardwareId;

	public String getServerUnique() {
		return serverUnique;
	}

	public void setServerUnique(String serverUnique) {
		this.serverUnique = serverUnique;
	}

	public Long getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(Long hardwareId) {
		this.hardwareId = hardwareId;
	}
	
}
