package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserHgVO
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年05月17日 10:16
 **/
public class UserHgVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 唯一键
     */

    private String uuid;

    /**
     * 对应用户id
     */
    private String userId;

    /**
     * 创建时间
     */
    private  Date  createTime;

    /**
     * 修改时间
     */
    private Date    modifyTime;

    /**
     * 会管的ip和端口
     */
    private String  hgIpPort;

    /**
     * 会管类型
     */
    private Integer type;

    public Integer getType(){
        return type;
    }

    public void setType(Integer type){
        this.type = type;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getHgIpPort() {
        return hgIpPort;
    }

    public void setHgIpPort(String hgIpPort) {
        this.hgIpPort = hgIpPort;
    }
}
