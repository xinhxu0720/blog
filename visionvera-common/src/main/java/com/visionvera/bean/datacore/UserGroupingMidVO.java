package com.visionvera.bean.datacore;

/**
 * @ClassName UserGroupingMidVO
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年03月29日 11:01
 **/
public class UserGroupingMidVO {
    /**
     * 唯一键
     */
    private String uuid;
    /**
     * 用户分组uuid
     */
    private String groupingId;
    /**
     * 用户id
     */
    private String groupingUserId;
    /**
     * 用户名字
     */
    private String userName;
    /**
     * 用户头像
     */
    private String imgUrl;


    public UserGroupingMidVO() {
        super();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGroupingUserId() {
        return groupingUserId;
    }

    public void setGroupingUserId(String groupingUserId) {
        this.groupingUserId = groupingUserId;
    }

    public String getGroupingId() {
        return groupingId;
    }

    public void setGroupingId(String groupingId) {
        this.groupingId = groupingId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
