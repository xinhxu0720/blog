package com.visionvera.config;

/**
 * @ClassName ServerConfig
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年09月29日 10:25
 **/

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
@PropertySource(value = "appServerConfig.properties",encoding = "UTF-8")
public class AppServerConfig {
    /**
     * 网管ip
     */
    private String wgIp;
    /**
     * 网管port
     */
    private String wgPort;
    /**
     * 网管登录账户
     */
    private String wgLoginName;
    /**
     * 网管登录密码
     */
    private String wgPwd;
    /**
     * 录播服务器ip
     */
    private String lbIp;
    /**
     * 录播服务器端口
     */
    private String lbPort;
    /**
     * 录播服务器登录账户
     */
    private String lbLoginName;
    /**
     * 录播服务器登录密码
     */
    private String lbPwd;
    /**
     * 网管审批用户缓存时间字段
     */
    private Integer wgCheckTime;
    /**
     * 虚拟会议室可申请入会次数(默认是3次)
     */
    private Integer applyCount;
    /**
     * 虚拟会议室可申请退会次数(默认是3次)
     */
    private Integer quitCount;

    /**
     * 掌上通ip
     */
    private String pserverIp;

    /**
     * 掌上通端口
     */
    private String pserverPort;

    /**
     * 设备管理ip
     */
    private String sbglIp;

    /**
     * 设备管理端口
     */
    private String sbglPort;

    /**
     * 智慧大脑ip
     */
    private String zhdnIp;

    /**
     * 智慧大脑端口
     */
    private String zhdnPort;

    /**
     * 智慧大脑脑图ip
     */
    private String zhdnntIp;

    /**
     * 智慧大脑脑图端口
     */
    private String zhdnntPort;

    /**
     * 公告图片上传到服务器路径名
     */
    private String publishImages;

    public String getPublishImages() {
        return publishImages;
    }

    public void setPublishImages(String publishImages) {
        this.publishImages = publishImages;
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public String getPserverIp() {
        return pserverIp;
    }

    public void setPserverIp(String pserverIp) {
        this.pserverIp = pserverIp;
    }

    public String getPserverPort() {
        return pserverPort;
    }

    public void setPserverPort(String pserverPort) {
        this.pserverPort = pserverPort;
    }

    public String getSbglIp() {
        return sbglIp;
    }

    public void setSbglIp(String sbglIp) {
        this.sbglIp = sbglIp;
    }

    public String getSbglPort() {
        return sbglPort;
    }

    public void setSbglPort(String sbglPort) {
        this.sbglPort = sbglPort;
    }

    public String getZhdnIp() {
        return zhdnIp;
    }

    public void setZhdnIp(String zhdnIp) {
        this.zhdnIp = zhdnIp;
    }

    public String getZhdnPort() {
        return zhdnPort;
    }

    public void setZhdnPort(String zhdnPort) {
        this.zhdnPort = zhdnPort;
    }

    public String getZhdnntIp() {
        return zhdnntIp;
    }

    public void setZhdnntIp(String zhdnntIp) {
        this.zhdnntIp = zhdnntIp;
    }

    public String getZhdnntPort() {
        return zhdnntPort;
    }

    public void setZhdnntPort(String zhdnntPort) {
        this.zhdnntPort = zhdnntPort;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public Integer getQuitCount() {
        return quitCount;
    }

    public void setQuitCount(Integer quitCount) {
        this.quitCount = quitCount;
    }

    public Integer getWgCheckTime() {
        return wgCheckTime;
    }

    public void setWgCheckTime(Integer wgCheckTime) {
        this.wgCheckTime = wgCheckTime;
    }

    public String getLbIp() {
        return lbIp;
    }

    public void setLbIp(String lbIp) {
        this.lbIp = lbIp;
    }

    public String getLbPort() {
        return lbPort;
    }

    public void setLbPort(String lbPort) {
        this.lbPort = lbPort;
    }

    public String getLbLoginName() {
        return lbLoginName;
    }

    public void setLbLoginName(String lbLoginName) {
        this.lbLoginName = lbLoginName;
    }

    public String getLbPwd() {
        return lbPwd;
    }

    public void setLbPwd(String lbPwd) {
        this.lbPwd = lbPwd;
    }

    public String getWgIp() {
        return wgIp;
    }

    public void setWgIp(String wgIp) {
        this.wgIp = wgIp;
    }

    public String getWgPort() {
        return wgPort;
    }

    public void setWgPort(String wgPort) {
        this.wgPort = wgPort;
    }

    public String getWgLoginName() {
        return wgLoginName;
    }

    public void setWgLoginName(String wgLoginName) {
        this.wgLoginName = wgLoginName;
    }

    public String getWgPwd() {
        return wgPwd;
    }

    public void setWgPwd(String wgPwd) {
        this.wgPwd = wgPwd;
    }

    public String getWgUrl(){ 
    	return "http://"+this.getWgIp()+":"+this.getWgPort();
    }
}
