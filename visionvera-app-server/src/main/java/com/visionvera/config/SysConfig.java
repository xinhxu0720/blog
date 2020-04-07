package com.visionvera.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SysConfig {
	@Value("${hg.ip}")
	private String hgIp;
	@Value("${hg.port}")
	private String hgPort;
	@Value("${hg.protocol}")
	private String hgProtocol;

	public String getHgIp() {
		return hgIp;
	}
	public void setHgIp(String hgIp) {
		this.hgIp = hgIp;
	}
	public String getHgPort() {
		return hgPort;
	}
	public void setHgPort(String hgPort) {
		this.hgPort = hgPort;
	}

	public String getHgProtocol() {
		return hgProtocol;
	}

	public void setHgProtocol(String hgProtocol) {
		this.hgProtocol = hgProtocol;
	}
}
