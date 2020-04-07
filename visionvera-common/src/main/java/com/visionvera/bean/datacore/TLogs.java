package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.List;

/**
 * 日志
 *
 */
public class TLogs implements Serializable {
	private static final long serialVersionUID = 1L;

    private String platId;//日志来源平台ID
    private String platType;//日志来源平台类型
    private List<TLogBody> items;//日志内容

	public List<TLogBody> getItems() {
		return items;
	}

	public void setItems(List<TLogBody> items) {
		this.items = items;
	}

	public String getPlatId() {
		return platId;
	}

	public void setPlatId(String platId) {
		this.platId = platId;
	}

	public String getPlatType() {
		return platType;
	}

	public void setPlatType(String platType) {
		this.platType = platType;
	}
}