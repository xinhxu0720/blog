package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 日志类型
 *
 */
public class TLogType implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;//日志类型ID

    private String name;//名称

    private String description;//描述信息

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}