package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * @ClassName HgListVO
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年05月17日 11:06
 **/
public class HgListVO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 唯一键
     */
    private String uuid;

    /**
     * 会管名字
     */
    private String name;

    /**
     * 会管类型
     */
    private Integer type;

    /**
     * 会管ip
     */
    private String ip;

    /**
     * 会管端口
     */
    private String port;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
